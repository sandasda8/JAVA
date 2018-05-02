package Races;

public class Race {
    private int gold = 200;
    private int moves = 1;

    public Race(int gold, int moves) {
        this.gold = gold;
        this.moves = moves;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }

    @Override
    public String toString() {
        return "Race{" +
                "gold=" + gold +
                ", moves=" + moves +
                '}';
    }
}
