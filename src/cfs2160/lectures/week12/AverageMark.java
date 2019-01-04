package cfs2160.lectures.week12;

import java.util.Scanner;

public class AverageMark {

    public static void main (String[] args) {

        final int NUMBER_OF_MARKS = 6;

        Scanner in = new Scanner (System.in);

        int [] marks;
        marks = new int [NUMBER_OF_MARKS];

        for (int i = 0; i < NUMBER_OF_MARKS; i ++) {
            System.out.print ("Enter a Mark: ");
            marks [i] = in.nextInt ();
        }

        int totalMarks = 0;
        for (int i = 0; i < NUMBER_OF_MARKS; i ++) {
            totalMarks += marks [i];
        }

        System.out.println ("Average Mark: " + totalMarks / (NUMBER_OF_MARKS * 1.0));

    }
}
