package cfs2160.lectures.week14.simple.contacts;

import java.util.Scanner;

public class PhoneBook {

    public static void main (String[] args) {

        Contacts c = new Contacts ();
        Scanner in = new Scanner (System.in);

        System.out.print ("Enter Name: ");
        String name = in.nextLine ();

        if (c.containsPerson (name)) {
            System.out.println (c.lookUpNumber (name));
        }
        else {
            System.out.println ("Not found. Sorry.");
        }
    }
}
