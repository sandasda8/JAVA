package VendingMachine;

public class DrinkVendingMachine extends EmptyVendingMachine {
    private boolean coldOrWarm;

    public DrinkVendingMachine(int cups, boolean coldOrWarm) {
        super(0, cups, true);
        this.coldOrWarm = coldOrWarm;
    }
    public boolean isColdOrWarm() {
        return coldOrWarm;
    }

    public void setColdOrWarm(boolean coldOrWarm) {
        this.coldOrWarm = coldOrWarm;
    }

    public void putMoneyIn(int money) {
        int teaPrice = 95;
        System.out.println("You can buy tea for " + teaPrice + "Ft.");
        if (this.cups <= 0 || isUsable == false){
            System.out.println("Try later.");
        } else if (money < teaPrice) {
            System.out.println("Not enough money");
        } else if (money >= teaPrice){
            System.out.println("Your tea is ready, change back: " + (money-teaPrice) + "Ft.");
            cups--;
            moneyIn += teaPrice;
        } else {
            System.out.println("Unsuccessful buy.");
        }
    }

    @Override
    public String toString() {
        if (coldOrWarm) {
            return super.toString() + ". This machine offers cold drinks.";
        } else {
            return super.toString() + ". This machine offers hot drinks.";
        }
    }
}
