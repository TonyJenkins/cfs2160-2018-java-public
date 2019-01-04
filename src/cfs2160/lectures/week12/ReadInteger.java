package cfs2160.lectures.week12;

import java.util.Scanner;

public class ReadInteger {

    public static void main (String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.print ("Enter a Number: ");
        String entered = in.nextLine ();

        try {
            Integer num = Integer.parseInt (entered);
            num *= 2;
            System.out.println (num);
        }
        catch (NumberFormatException e) {
            System.out.println ("Enter a Number!");
        }
    }
}
