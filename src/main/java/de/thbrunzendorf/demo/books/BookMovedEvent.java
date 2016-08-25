package de.thbrunzendorf.demo.books;

/**
 * Created by Thorsten on 25.08.2016.
 */
public class BookMovedEvent implements Event {
    private final String bookId;
    private final String location;

    public BookMovedEvent(String bookId, String location) {
        this.bookId = bookId;
        this.location = location;
    }

    public String getBookId() {
        return bookId;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookMovedEvent that = (BookMovedEvent) o;

        if (!bookId.equals(that.bookId)) return false;
        return location.equals(that.location);

    }

    @Override
    public int hashCode() {
        int result = bookId.hashCode();
        result = 31 * result + location.hashCode();
        return result;
    }
}
