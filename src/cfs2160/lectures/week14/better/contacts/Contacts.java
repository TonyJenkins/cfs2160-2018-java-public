package cfs2160.lectures.week14.better.contacts;

import java.util.HashMap;
import java.util.NoSuchElementException;

public class Contacts {

    private HashMap <String, String> phoneBook;

    public Contacts () {
        phoneBook = new HashMap<> ();
        fillBook ();
    }

    private void fillBook () {
        phoneBook.put ("Len Smith", "(01484) 472209");
        phoneBook.put ("Lisa Jones", "(01484) 1234567");
        phoneBook.put("William H. Smith", "(0113) 7846251");
    }

    public boolean containsPerson (String k) {
        return phoneBook.containsKey (k);
    }

    public String lookUpNumber (String name) {

        if (!phoneBook.containsKey (name)) {
            throw new NoSuchElementException ("Name not found in Phone Book");
        }
        return phoneBook.get (name);
    }
}
