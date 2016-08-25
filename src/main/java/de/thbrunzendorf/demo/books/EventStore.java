package de.thbrunzendorf.demo.books;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thorsten on 26.06.2016.
 */
public class EventStore {

    private static List<Event> events = new ArrayList<Event>();

    public static void append(Event event) {
        events.add(event);
    }

    public static List<Event> retrieve(String id) {
        List<Event> eventsForId = new ArrayList<Event>();
        for (Event event : events) {
            eventsForId.add(event);
        }
        return eventsForId;
    }

    public static void clear() {
        events.clear();
    }
}
