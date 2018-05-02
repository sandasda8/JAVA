public class ReturnTicket extends Ticket {
    private int numberOfUses = 0;
    public ReturnTicket(int forHowManyKm, String destination, boolean validity, double discount) {
        super(forHowManyKm, destination, validity, discount);
        this.numberOfUses = 0;
    }

    public int getNumberOfUses() {
        return numberOfUses;
    }

    public void setNumberOfUses(int numberOfUses) {
        this.numberOfUses = numberOfUses;
    }
    public void uses(){
        if (getNumberOfUses() >= 2) {
            setValidity(false);
        } else {
            numberOfUses++;
        }
    }
    public int calculatePrice() {
        return super.calculatePrice()*2;
    }
}
