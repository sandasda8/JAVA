
public class WordCountWrapper implements Comparable<WordCountWrapper>{
    private String word;
    private int wordcount;

    public WordCountWrapper(String word, int wordcount) {
        this.word = word;
        this.wordcount = wordcount;
    }

    @Override
    public int compareTo(WordCountWrapper wordCountWrapper){
        if (wordCountWrapper.wordcount > this.wordcount) {
            return 1;
        } else if (wordCountWrapper.wordcount == this.wordcount) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "WordCountWrapper{" +
                "word='" + word + '\'' +
                ", wordcount=" + wordcount +
                '}';
    }
}


