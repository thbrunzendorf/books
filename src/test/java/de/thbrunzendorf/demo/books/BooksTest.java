package de.thbrunzendorf.demo.books;

import org.junit.Test;

/**
 * Created by Thorsten on 15.06.2016.
 */
public class BooksTest {


    private void when(RegisterBookCommand command) {
    }

    private void then(BookRegisteredEvent event) {
    }

    @Test
    public void bookRegistered() {
        when(new RegisterBookCommand("Refactoring","Martin Fowler"));
        then(new BookRegisteredEvent());
    }
}
