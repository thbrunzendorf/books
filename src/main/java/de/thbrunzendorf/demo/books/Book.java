package de.thbrunzendorf.demo.books;

/**
 * Created by Thorsten on 15.06.2016.
 */
public class Book {
    public Book(String id, String title, String author) {
         publish(new BookRegisteredEvent());
    }

    private void publish(BookRegisteredEvent event) {
        apply(event);
        Publisher.publish(event);
    }

    private void apply(BookRegisteredEvent event) {
    }
}
