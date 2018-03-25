package Warehouse;

public class MilkProduct implements Product {
    private long madeDate;
    private long expireDate;
    private String name;
    long purchaseDate = System.currentTimeMillis();

    public MilkProduct(long madeDate, long expireDate, String name) {
        this.madeDate = madeDate;
        this.expireDate = expireDate;
        this.name = name;
    }

    public boolean isItGood() throws BadQuality {
        if (this.madeDate - this.purchaseDate < this.expireDate) {
            return true;
        } else {
            throw new BadQuality("This product is expired.");
        }
    }

    public String toString() {
        return "Milk: " + this.name + ";" + this.madeDate + ";" + this.expireDate;
    }
}
