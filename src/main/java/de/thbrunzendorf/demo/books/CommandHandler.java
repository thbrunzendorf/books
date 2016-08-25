package de.thbrunzendorf.demo.books;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Thorsten on 15.06.2016.
 */
public abstract class CommandHandler {

    abstract public List<Event> handle(Command command);

    public static CommandHandler createFor(Command command) {
        if (command instanceof RegisterBookCommand)
            return new RegisterBookCommandHandler();
        if (command instanceof MoveBookCommand)
            return new MoveBookCommandHandler();
        throw new RuntimeException("Missing Handler for Command "+command.getClass().getName());
    }
}
