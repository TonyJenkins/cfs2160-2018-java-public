package cfs2160.lectures.week08;

public class EmployeeDemo {

    public static void main (String[] args) {

        Employee e = new Employee (123, "John Smith", 10);

        System.out.println ("e = " + e);

        System.out.println ("Checking rating cannot be > 10 ...");

        if (!e.upRating ()) {
            System.out.println ("It doesn't work. Cool Beans.");
        }
        else {
            System.out.println ("It worked. How sad.");
        }

        System.out.println ("e = " + e);


        
    }
}
