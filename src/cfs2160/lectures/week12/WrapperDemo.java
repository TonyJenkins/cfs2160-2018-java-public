package cfs2160.lectures.week12;

public class WrapperDemo {

    public static void main (String[] args) {

        Integer i = new Integer (10);
        System.out.println (i);

        i += 1;

        System.out.println (i);

        Integer j;

        j = 1;

        if (j.equals (1)) {
            System.out.println ("It's equal and an object.");
        }

    }
}
