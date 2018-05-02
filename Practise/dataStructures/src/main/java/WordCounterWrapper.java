public class WordCounterWrapper implements Comparable<WordCounterWrapper>{
    private String word;
    private int wordcount;

    public WordCounterWrapper(String word, int wordcount) {
        this.word = word;
        this.wordcount = wordcount;
    }
    public int compareTo(WordCounterWrapper wordCounterWrapper){
        if (wordCounterWrapper.wordcount > this.wordcount) {
            return 1;
        } else if (wordCounterWrapper.wordcount == this.wordcount) {
            return 0;
        } else {
            return -1;
        }
    }
}
