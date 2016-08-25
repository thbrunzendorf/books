package de.thbrunzendorf.demo.books;

import java.util.UUID;

/**
 * Created by Thorsten on 25.08.2016.
 */
public class IdGenerator {

    static String lastId = "";

    public static String generate() {
        String id = UUID.randomUUID().toString();
        lastId = id;
        return id;
    }

    public static String getLastId() {
        return lastId;
    }
}
