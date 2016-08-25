package de.thbrunzendorf.demo.books;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Thorsten on 15.06.2016.
 */
public class BooksTest {

    private List<Event> newEvents = new ArrayList<Event>();

    @Before
    public void before() {
        Publisher.reset();
    }

    private void given() {
    }

    private void given(Event event) {
        EventStore.append(event);
    }

    private void when(Command command) {
        newEvents = CommandHandler.createFor(command).handle(command);
    }

    private void then(Event event) {
        List<Event> expectedEvents = new ArrayList<Event>();
        expectedEvents.add(event);
        assertEquals(expectedEvents, newEvents);
    }

    @Test
    public void bookRegistered() {
        given();
        when(new RegisterBookCommand("Refactoring","Martin Fowler"));
        String newBookId = IdGenerator.getLastId();
        then(new BookRegisteredEvent(newBookId, "Refactoring","Martin Fowler"));
    }

    @Test
    public void bookMoved() {
        String someBookId = "123";
        given(new BookRegisteredEvent(someBookId, "someTitle", "someAuthor"));
        when(new MoveBookCommand(someBookId, "Work"));
        then(new BookMovedEvent(someBookId, "Work"));
    }


}
