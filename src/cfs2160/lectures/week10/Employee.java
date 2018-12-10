package cfs2160.lectures.week10;

public class Employee {

    private String name;
    private int rating;

    public Employee (String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getRating () {
        return rating;
    }

    public void setRating (int rating) {
        this.rating = rating;
    }

    public String getRatingDescription () {
        if (this.rating <= 2) {
            return "Poor";
        }
        else if (this.rating <= 7) {
            return "OK";
        }
        else {
            return "Excellent";
        }
    }

    @Override
    public String toString () {

        String s = "";

        s += this.name + " is ";
        s += this.getRatingDescription ();

        return s;
    }

    public static void main (String[] args) {

        Employee bob = new Employee ("Bob", 8);
        System.out.println (bob);

        Employee trev = new Employee ("Trev", 3);
        System.out.println (trev);

    }

}
