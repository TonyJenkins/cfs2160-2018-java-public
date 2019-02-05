package cfs2160.lectures.week15.social.network.v2;

public class MessagePost extends Post {

    private String message;

    public MessagePost (String author, String message) {
        super (author);
        this.message = message;
    }

    public String getMessage () {
        return message;
    }

    public void setMessage (String message) {
        this.message = message;
    }
}
