package cfs2160.lectures.week15.social.network.v1;

import java.util.ArrayList;

public class PhotoPost {

    private String author;
    private String filename;
    private String caption;
    private int likes;
    private ArrayList <String> comments;

    public PhotoPost (String author, String filename, String caption) {
        this.author = author;
        this.filename = filename;
        this.caption = caption;
        this.likes = 0;
        this.comments = new ArrayList <String> ();
    }

    public String getAuthor () {
        return author;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public String getFilename () {
        return filename;
    }

    public void setFilename (String filename) {
        this.filename = filename;
    }

    public String getCaption () {
        return caption;
    }

    public void setCaption (String caption) {
        this.caption = caption;
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
        this.likes --;
    }

    private void addComment (String comment) {
        this.comments.add (comment);
    }

    public void display () {
        System.out.println (author);
        System.out.println ("  [" + this.filename + "]");
        System.out.println ("  " + this.caption);

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
