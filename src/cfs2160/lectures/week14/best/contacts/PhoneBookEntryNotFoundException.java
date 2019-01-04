package cfs2160.lectures.week14.best.contacts;

public class PhoneBookEntryNotFoundException extends Exception {

    public PhoneBookEntryNotFoundException () {}

    public PhoneBookEntryNotFoundException (String message) {
        super (message);
    }
}
