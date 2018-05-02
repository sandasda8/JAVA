package Races;

public class Orc extends Race{
    private boolean bloodlust = false;

    public Orc(int gold, int moves, boolean bloodlust) {
        super(gold, moves);
        this.bloodlust = bloodlust;
    }

    public boolean isBloodlust() {
        return bloodlust;
    }

    public void setBloodlust(boolean bloodlust) {
        this.bloodlust = bloodlust;
    }
}
