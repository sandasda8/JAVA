import java.util.*;

public class VideoLibrary{
    Map<String, Video> videos = new HashMap <>();
    Map<String, TutorialVideo> tutorialVideos = new HashMap <>();

    public VideoLibrary() {
    }

    public void addTo(Video video) {
        if (video.getClass() == Video.class) {
            videos.put(video.getFilmTitle(), video);
        } else if (video.getClass() == TutorialVideo.class) {
            tutorialVideos.put(video.getFilmTitle(), (TutorialVideo) video);
        }
    }
    public Video search(String name, boolean isTutorial) throws NotFoundException{
        if (!isTutorial && videos.containsKey(name)){
            return videos.get(name);
        } else if (isTutorial && tutorialVideos.containsKey(name)){
            return tutorialVideos.get(name);
        } else {
            throw new NotFoundException("There is no film like this.");
        }

    }

}
