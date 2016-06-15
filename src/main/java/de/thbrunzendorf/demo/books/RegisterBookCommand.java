package de.thbrunzendorf.demo.books;

/**
 * Created by Thorsten on 15.06.2016.
 */
public class RegisterBookCommand {
    private String title;
    private String author;
    public RegisterBookCommand(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
