package cfs2160.lectures.week15.social.network.v4;

import java.util.ArrayList;

public class NewsFeed {

    private ArrayList <Post> posts;

    public NewsFeed () {
        posts = new ArrayList<> ();
    }

    public void addPost (Post p) {
        posts.add (p);
    }

    public void show () {
        for (Post p : posts) {

            if (p instanceof MessagePost) {
                ((MessagePost) p).display ();
            }
            else {
                ((PhotoPost) p).display ();
            }

            System.out.println ("---------------------");
        }
    }
}
