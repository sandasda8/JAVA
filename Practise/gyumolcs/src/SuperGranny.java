import java.util.Arrays;
import java.util.Random;

public class SuperGranny extends Buyer{
    private float haggle;

    public SuperGranny(Fruit[] bag, int wallet) {
        super(bag, (int) (wallet * 0.8));
        this.haggle = Math.round(Math.random());
    }

    public void iToldYa(){
        System.out.println("I told ya he is up for bargaining.");
    }
    public void purchase(Fruit fruit) {
        if (fruit.getPrice() <= getWallet() && fruit.getColor().equals("green") || fruit.getColor().equals("yellow")) {
            if (haggle < 0.75f) {
                wallet -= fruit.getPrice() * 0.9;
                bag[bagCounter] = fruit;
                bagCounter++;
                System.out.println("You bought this " + fruit + ". 10% less.");
                iToldYa();
            } else {
                wallet -= fruit.getPrice();
                bag[bagCounter] = fruit;
                bagCounter++;
                System.out.println("You bought this " + fruit + ". At normal price.");
            }
        } else if (fruit.getPrice() > getWallet()) {
            System.out.println("Not enough money to buy " + fruit + ".");
        } else {
            System.out.println("The fruit is not green enough for us.");
        }
    }

    @Override
    public String toString() {
        return "SuperGranny{" +
                "haggle=" + haggle +
                ", bag=" + Arrays.toString(bag) +
                ", wallet=" + wallet +
                '}';
    }
}

