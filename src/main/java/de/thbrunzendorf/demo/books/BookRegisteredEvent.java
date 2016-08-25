package de.thbrunzendorf.demo.books;

/**
 * Created by Thorsten on 15.06.2016.
 */
public class BookRegisteredEvent implements Event {

    private String bookId;
    private String title;
    private String author;

    public BookRegisteredEvent(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public int hashCode() {
        int result = bookId.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookRegisteredEvent that = (BookRegisteredEvent) o;
        if (!bookId.equals(that.bookId)) return false;
        if (!title.equals(that.title)) return false;
        return author.equals(that.author);
    }
}
