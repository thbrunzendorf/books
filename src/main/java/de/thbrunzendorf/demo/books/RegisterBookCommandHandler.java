package de.thbrunzendorf.demo.books;

import java.util.List;
import java.util.UUID;

/**
 * Created by Thorsten on 25.08.2016.
 */
public class RegisterBookCommandHandler extends CommandHandler {

    public List<Event> handle(Command command) {
        RegisterBookCommand registerBookCommand = (RegisterBookCommand) command;
        String id = IdGenerator.generate();
        Book book = new Book(id, registerBookCommand.getTitle(), registerBookCommand.getAuthor());
        return Publisher.published();
    }

}
