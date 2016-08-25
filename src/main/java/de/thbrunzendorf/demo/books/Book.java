package de.thbrunzendorf.demo.books;

import java.util.List;

/**
 * Created by Thorsten on 15.06.2016.
 */
public class Book {
    private String id;

    public Book(String id, String title, String author) {
         publish(new BookRegisteredEvent(id, title, author));
    }

    public Book(List<Event> events) {
        for (Event event : events) {
            apply(event);
        }
    }

    public void move(String location) {
        publish(new BookMovedEvent(this.id, location));
    }

    private void publish(Event event) {
        apply(event);
        Publisher.publish(event);
    }

    private void apply(Event event) {
        if (event instanceof  BookRegisteredEvent) {
            apply((BookRegisteredEvent) event);
        } else if (event instanceof BookMovedEvent) {
            apply((BookMovedEvent) event);
        } else {
            throw new RuntimeException("Missing application for Event "+event.getClass().getName());
        }
    }

    private void apply(BookRegisteredEvent event) {
        this.id = event.getBookId();
    }

    private void apply(BookMovedEvent event) {
    }
}
