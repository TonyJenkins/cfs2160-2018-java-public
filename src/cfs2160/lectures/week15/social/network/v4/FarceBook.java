package cfs2160.lectures.week15.social.network.v4;

public class FarceBook {

    public static void main (String[] args) {

        MessagePost m1 = new MessagePost ("Donald", "The geese fly south today.");
        MessagePost m2 = new MessagePost ("Mickey", "I have lost the pencil of my aunt.");
        PhotoPost p1 = new PhotoPost ("Minnie", "pluto.jpg", "Pluto");
        PhotoPost p2 = new PhotoPost ("Daisy", "goofy.png", "Goofy");

        NewsFeed nf = new NewsFeed ();

        nf.addPost (m1);
        nf.addPost (p1);
        nf.addPost (m2);
        nf.addPost (p2);

        nf.show ();
    }
}
