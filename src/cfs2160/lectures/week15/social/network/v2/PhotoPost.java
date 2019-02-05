package cfs2160.lectures.week15.social.network.v2;

public class PhotoPost extends Post {

    private String filename;
    private String caption;

    public PhotoPost (String author, String filename, String caption) {
        super (author);
        this.filename = filename;
        this.caption = caption;
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
}
