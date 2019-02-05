package cfs2160.lectures.week15.social.network.v5;

import java.util.ArrayList;

abstract public class Post {

    private String author;
    private int likes;
    private ArrayList<String> comments;

    public Post (String author) {
        this.author = author;
        this.likes = 0;
        this.comments = new ArrayList <> ();
    }

    public String getAuthor () {
        return author;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public int getLikes () {
        return likes;
    }

    public void setLikes (int likes) {
        this.likes = likes;
    }

    public ArrayList<String> getComments () {
        return comments;
    }

    public void setComments (ArrayList<String> comments) {
        this.comments = comments;
    }

    public void like () {
        this.likes ++;
    }

    public void unlike () {
        if (this.likes > 0) {
            this.likes--;
        }
    }

    private void addComment (String comment) {
        this.comments.add (comment);
    }

    abstract void display ();

    public void displayLikesAndComments () {

        if (this.likes > 0) {
            System.out.println (" - " + this.likes + " people like this.");
        }
        else {
            System.out.println ();
        }

        if (comments.isEmpty ()) {
            System.out.println ("No comments.");
        }
        else {
            System.out.println ("   " + this.comments.size () + " comment(s). Click to view.");
        }
    }

}
