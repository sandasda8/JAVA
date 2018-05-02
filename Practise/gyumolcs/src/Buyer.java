import java.util.Arrays;

public class Buyer {

    protected Fruit[] bag;
    protected int wallet;
    static int bagCounter = 0;

    public Buyer(Fruit[] bag, int wallet) {
        this.bag = bag;
        this.wallet = wallet;
    }

    public Fruit[] getBag() {
        return bag;
    }

    public void setBag(Fruit[] bag) {
        this.bag = bag;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
    public void purchase(Fruit fruit){

            if (fruit.getPrice() <= getWallet() && fruit.getColor().equals("green")) {
                wallet -= fruit.getPrice();
                bag[bagCounter] = fruit;
                bagCounter++;
                System.out.println("You bought this " + fruit + ".");
            } else if (fruit.getPrice() > getWallet()) {
                System.out.println("Not enough money to buy " + fruit + ".");
            } else {
                System.out.println("The fruit is not green enough for us.");
            }

    }

    @Override
    public String toString() {
        return "Buyer{" +
                "bag=" + Arrays.toString(bag) +
                ", wallet=" + wallet +
                '}';
    }
}
