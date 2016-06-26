package de.thbrunzendorf.demo.books;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thorsten on 26.06.2016.
 */
public class Publisher {
    private static List<BookRegisteredEvent> published = new ArrayList<BookRegisteredEvent>();

    public static void publish(BookRegisteredEvent event) {
        EventStore.store(event);
        published.add(event);
    }

    public static List<BookRegisteredEvent> published() {
        return published;
    }
}
