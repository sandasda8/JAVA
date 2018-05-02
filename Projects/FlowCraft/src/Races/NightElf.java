package Races;
import java.util.*;

public class NightElf extends Race{
    private int random = (int) Math.floor(Math.random() * 101);

    public NightElf(int gold, int moves) {
        super(gold, moves);
        if (random < 25){
            setMoves(2);
        }
    }
}
