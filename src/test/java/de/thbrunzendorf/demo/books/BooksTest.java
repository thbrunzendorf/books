package de.thbrunzendorf.demo.books;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Thorsten on 15.06.2016.
 */
public class BooksTest {

    private List<BookRegisteredEvent> newEvents = new ArrayList<BookRegisteredEvent>();

    private void when(RegisterBookCommand command) {
        BookRegisteredEvent event = new BookRegisteredEvent();
        newEvents.add(event);
    }

    private void then(BookRegisteredEvent event) {
        List<BookRegisteredEvent> expectedEvents = new ArrayList<BookRegisteredEvent>();
        expectedEvents.add(event);
        assertEquals(expectedEvents, newEvents);
    }

    @Test
    public void bookRegistered() {
        when(new RegisterBookCommand("Refactoring","Martin Fowler"));
        then(new BookRegisteredEvent());
    }
}
