package de.thbrunzendorf.demo.books;

import java.util.List;

/**
 * Created by Thorsten on 25.08.2016.
 */
public class MoveBookCommandHandler extends CommandHandler {

    @Override
    public List<Event> handle(Command command) {
        MoveBookCommand moveBookCommand = (MoveBookCommand) command;
        Book book = new Book(EventStore.retrieve(moveBookCommand.getBookId()));
        book.move(moveBookCommand.getLocation());
        return Publisher.published();
    }
}
