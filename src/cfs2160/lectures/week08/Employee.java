package cfs2160.lectures.week08;

public class Employee {

    private int id;
    private String name;
    private int rating;

    public Employee () {
    }

    public Employee (int id, String name, int rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
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

    public boolean upRating () {
        if (this.rating == 10) {
            return false;
        }
        else {
            this.rating++;
            return true;
        }
    }

    public boolean downRating () {
        if (this.rating == 0) {
            return false;
        }
        else {
            this.rating--;
            return true;
        }
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder ("Employee{");
        sb.append ("id=").append (id);
        sb.append (", name='").append (name).append ('\'');
        sb.append (", rating=").append (rating);
        sb.append ('}');
        return sb.toString ();
    }
}
