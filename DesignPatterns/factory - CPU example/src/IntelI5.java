
public class IntelI5 implements CPU {
    int freq;
    int cores;

    public IntelI5(int freq, int cores) {
        this.freq = freq;
        this.cores = cores;
    }

    @Override
    public int getFreq() {
        return freq;
    }

    @Override
    public int getCores() {
        return cores;
    }

    @Override
    public String toString() {
        return "IntelI5{" +
                "freq=" + freq +
                ", cores=" + cores +
                '}';
    }
}
