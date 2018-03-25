package VendingMachine;

public class EmptyVendingMachine {

protected int moneyIn;
protected int cups;
protected boolean isUsable;

    public EmptyVendingMachine(int moneyIn, int cups, boolean isUsable) {
        this.moneyIn = moneyIn;
        this.cups = cups;
        this.isUsable = isUsable;
    }

    public int getMoneyIn() {
        return moneyIn;
    }

    public void setMoneyIn(int moneyIn) {
        this.moneyIn = moneyIn;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public boolean isUsable() {
        return isUsable;
    }

    public void setUsable(boolean usable) {
        isUsable = usable;
    }

    public void putMoneyIn(int money){
        System.out.println("This machine not usable.");
    }

    @Override
    public String toString() {
        if (isUsable) {
            return "This machine is usable. Money in: " + moneyIn;
        } else {
            return "This machine is not usable. Money in: " + moneyIn;
        }
    }
}
