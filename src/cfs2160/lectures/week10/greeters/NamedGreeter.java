package cfs2160.lectures.week10.greeters;

import java.util.Scanner;

public class NamedGreeter {

    public static void sayHelloWorld (String name) {
        System.out.println ("Hello, " + name + '.');
    }

    public static void main (String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.print ("Hello. Who are you? ");
        String name = in.nextLine ();

        sayHelloWorld (name);
    }
}
