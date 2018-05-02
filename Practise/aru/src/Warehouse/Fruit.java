package Warehouse;

import java.util.Random;

public class Fruit implements Product {
    private Random randomRot = new Random();
    private String fruitName;

    public Fruit(String fruitName) {
        this.fruitName = fruitName;
    }

    public boolean isItGood() throws BadQuality {
        int value = this.randomRot.nextInt(6);
        if (value == 3) {
            throw new BadQuality("This fruit is rotten, I wouldn't buy it.");
        } else {
            return value % 2 == 0;
        }
    }

    public String toString() {
        return "Fruit: " + this.fruitName;
    }
}
