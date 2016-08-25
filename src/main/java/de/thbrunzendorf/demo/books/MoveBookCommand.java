package de.thbrunzendorf.demo.books;

/**
 * Created by Thorsten on 26.06.2016.
 */
public class MoveBookCommand implements Command {

    private String bookId;
    private String location;

    public MoveBookCommand(String bookId, String location) {
        this.bookId = bookId;
        this.location = location;
    }

    public String getBookId() {
        return bookId;
    }

    public String getLocation() {
        return location;
    }
}
