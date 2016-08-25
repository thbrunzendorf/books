package de.thbrunzendorf.demo.books;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thorsten on 26.06.2016.
 */
public class Publisher {
    private static List<Event> published = new ArrayList<Event>();

    public static void publish(Event event) {
        EventStore.append(event);
        published.add(event);
    }

    public static List<Event> published() {
        return published;
    }

    public static void reset() {
        EventStore.clear();
        published.clear();
    }
}
