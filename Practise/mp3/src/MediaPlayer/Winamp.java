package MediaPlayer;
import Media.*;

public class Winamp {
    Mp3[] mp3Array;
    int mp3ArrayCounter;
    int counter = 0;

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


        Winamp player = new Winamp(4);
        Mp3 song1 = new Mp3("Deák Bill Gyula", "Rossz vér", "Rossz vér", 467);
        Mp3 song2 = new Mp3("KFT", "Siker, Pénz, Nők, Csillogás (1986)", "Balatoni Nyár", 300);
        VideoClip song3 = new VideoClip("Radiohead", "OK Computer", "Paranoid Android", 398,  320, 240);
        VideoClip song4 = new VideoClip("Red Hot Chili Peppers", "Californication", "Otherside", 255, 480, 320);
        player.add(song1);
        player.add(song2);
        player.add(song3);
        player.add(song4);
        System.out.println(info(player.query(0)));
        info(player.query(2));
        for (int i = 1; i < 4; i++) {
            System.out.println(player.info(player.mp3Array[i]));
        }
        System.out.println("Average length:" + player.averageLength());
    }

    public int averageLength() {
        int totalLength = 0;
        for (int i = 0; i < mp3Array.length; i++) {
            totalLength += mp3Array[i].getTrackLength();
        }
        return totalLength / mp3Array.length;
    }
}

