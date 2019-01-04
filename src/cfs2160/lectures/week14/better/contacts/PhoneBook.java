package cfs2160.lectures.week14.better.contacts;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class PhoneBook {

    public static void main (String[] args) {

        Contacts c = new Contacts ();
        Scanner in = new Scanner (System.in);

        System.out.print ("Enter Name: ");
        String name = in.nextLine ();

        try {
            System.out.println (c.lookUpNumber (name));
        }
        catch (NoSuchElementException e) {
            System.out.println ("Not found. Sorry.");
        }
    }
}
