public class Fruit {
    private int price;
    private String color;
    private String type;

    public Fruit(int price, String color, String type) {
        this.price = price;
        if (color.equals("green") || color.equals("yellow") || color.equals("red")){
            this.color = color;
        }
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", fajta='" + type + '\'' +
                '}';
    }
}
