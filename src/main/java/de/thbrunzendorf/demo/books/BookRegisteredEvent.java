package de.thbrunzendorf.demo.books;

/**
 * Created by Thorsten on 15.06.2016.
 */
public class BookRegisteredEvent {

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {return false;}
        if (this.getClass() != obj.getClass()) {return false;}
        return true;
    }
}
