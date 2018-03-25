package MediaPlayer;
import Media.*;

public class Winamp {
    Mp3[] mp3Array;
    int mp3ArrayCounter;
    int counter;

    public Winamp(int mp3ArrayCounter) {
        this.mp3ArrayCounter = mp3ArrayCounter;
        this.mp3Array = new Mp3[mp3ArrayCounter];
        this.counter = 0;
    }

    public void add(Mp3 song){

        if (counter < mp3ArrayCounter) {
            mp3Array[counter] = song;
            counter++;
        } else {
            System.out.println("error");
        }
    }
    public Mp3 query(int i) {
        Mp3 query = mp3Array[i];
        return query;
    }
    public static String info(Mp3 track){
        return track.toString();
    }
    public static void main(String[] args) {
       /* Winamp player = new Winamp(args.length);
        for (int i = 0; i < args.length; i++) {
            if (args[0].equals("Mp3")) {
                Mp3 song1 = new Mp3(args[1], args[2], args[3], Integer.parseInt(args[4]));
                player.add(song1);
                info(song1);
            } else if (args[0].equals("Mp4")) {
                Mp3 song1 = new VideoClip(args[1], args[2], args[3], Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]));
                player.add(song1);
                info(song1);
            } else {
                System.out.println("error");
            }
        } */

        Winamp playlist = new Winamp(4);
        Mp3 song1 = new Mp3("Deák Bill Gyula", "Rossz vér", "Rossz vér", 467);
        Mp3 song2 = new Mp3("KFT", "Siker, Pénz, Nők, Csillogás (1986)", "Balatoni Nyár", 300);
        VideoClip song3 = new VideoClip("Radiohead", "OK Computer", "Paranoid Android", 398,  320, 240);
        VideoClip song4 = new VideoClip("Red Hot Chili Peppers", "Californication", "Otherside", 255, 480, 320);
        playlist.add(song1);
        playlist.add(song2);
        playlist.add(song3);
        playlist.add(song4);
        System.out.println(info(playlist.query(0)));
        info(playlist.query(2));
        for (int i = 0; i < playlist.mp3ArrayCounter; i++ ) {
            if (){}
        }
    }
}

