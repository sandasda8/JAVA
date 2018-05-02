import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws NotFoundException, WrongRentalException {
        VideoLibrary library = new VideoLibrary();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/attila/IdeaProjects/VHS/src/input.txt"));

            String line;
            int stepper = 0;

            while ((line = reader.readLine()) != null) {
                if (stepper > 0) {
                    String[] splittedline = line.split(";");
                    String title = splittedline[0];
                    String rentTime = splittedline[1];
                    if (splittedline.length == 3) {
                        int ageLimit = Integer.parseInt(splittedline[2]);
                        library.addTo(new Video(title, rentTime, ageLimit));
                    } else {
                        library.addTo(new TutorialVideo(title, rentTime));
                    }
                }
                stepper++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // library.forEach().renting(12, "oneday");

        if (library.videos.containsKey("TheGodfather")){
            Video video = library.videos.get("TheGodfather");
            video.renting(18, 1);
        }
        System.out.println(library.search("TheGodfather", false));
        System.out.println(library.search("FightClub", false));
        System.out.println(library.search("TheMatrix", true));

    }

}
