package Media;

public class Mp3 {
    private String performer;
    private String album;
    private String trackTitle;
    private int trackLength;

    public Mp3(String performer, String album, String trackTitle, int trackLength) {
        this.performer = performer;
        this.album = album;
        this.trackTitle = trackTitle;
        this.trackLength = trackLength;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTrackTitle() {
        return trackTitle;
    }

    public void setTrackTitle(String trackTitle) {
        this.trackTitle = trackTitle;
    }

    public int getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    @Override
    public String toString() {
        return "This track is from " + performer + ". This is his/her " + trackTitle + " titled track. Which can be heard on his/her "
                + album + ". The length of it is " + trackLength + " seconds";
    }

}
