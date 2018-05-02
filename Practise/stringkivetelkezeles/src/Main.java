import java.util.StringTokenizer;
public class Main {

    public static void main (String[] args) {
        String sentence = "This is a sentence";
        String[] words = sentence.split(" ");
        /*for(int i=0; i < words.length; i++) {
            System.out.println("The " + (i + 1) + ". szo: " + words[i]);
        }*/

        StringTokenizer newSentence = new StringTokenizer("Something in the way.");
        while (newSentence.hasMoreTokens()) {
            System.out.println(newSentence.nextToken());

        }
    }
}
