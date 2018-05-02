public class Ticket {
    private int forHowManyKm;
    private String destination;
    private boolean validity;
    private double discount;
    private static int priceOfKm = 25;

    public Ticket(int forHowManyKm, String destination, boolean validity, double discount) {
        this.forHowManyKm = forHowManyKm;
        this.destination = destination;
        this.validity = validity;
        this.discount = discount;
    }

    public int calculatePrice() {
        return Math.toIntExact(Math.round((forHowManyKm * priceOfKm) - ((forHowManyKm * priceOfKm) * (discount / 100))));
    }

    public void use(){
        validity = false;
    }

    public int getForHowManyKm() {
        return forHowManyKm;
    }

    public void setForHowManyKm(int forHowManyKm) {
        this.forHowManyKm = forHowManyKm;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isValidity() {
        return validity;
    }

    public void setValidity(boolean validity) {
        this.validity = validity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public static int getPriceOfKm() {
        return priceOfKm;
    }

    public static void setPriceOfKm(int priceOfKm) {
        Ticket.priceOfKm = priceOfKm;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "forHowManyKm=" + forHowManyKm +
                ", destination='" + destination + '\'' +
                ", validity=" + validity +
                ", discount=" + discount +
                '}';
    }
}
