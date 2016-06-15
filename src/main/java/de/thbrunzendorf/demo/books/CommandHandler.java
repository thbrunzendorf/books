package de.thbrunzendorf.demo.books;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Thorsten on 15.06.2016.
 */
public class CommandHandler {
    public CommandHandler() {
    }

    public List<BookRegisteredEvent> handle(RegisterBookCommand command) {
        String id = UUID.randomUUID().toString();
        Book book = new Book(id, command.getTitle(), command.getAuthor());
        ArrayList<BookRegisteredEvent> events = new ArrayList<BookRegisteredEvent>();
        events.add(new BookRegisteredEvent());
        return events;
    }
}
