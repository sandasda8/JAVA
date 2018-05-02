package Media;

public class VideoClip extends Mp3{
    private int videoPictureWidth;
    private int videoPictureLength;

    public VideoClip(String performer, String album, String trackTitle, int trackLength, int videoPictureWidth, int videoPictureLength) {
        super(performer, album, trackTitle, trackLength);
        this.videoPictureWidth = videoPictureWidth;
        this.videoPictureLength = videoPictureLength;
    }

    public int getVideoPictureWidth() {
        return videoPictureWidth;
    }

    public void setVideoPictureWidth(int videoPictureWidth) {
        this.videoPictureWidth = videoPictureWidth;
    }

    public int getVideoPictureLength() {
        return videoPictureLength;
    }

    public void setVideoPictureLength(int videoPictureLength) {
        this.videoPictureLength = videoPictureLength;
    }

    @Override
    public String toString() {
        return super.toString() + " The resolution of the video is " + videoPictureWidth + " : " + videoPictureLength + ".";
    }
}
