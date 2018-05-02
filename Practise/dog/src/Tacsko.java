public class Tacsko extends Dog {
    private String tacsi;


    public Tacsko(String color, String name, String tacsi) {
        super(color, name);
        this.tacsi = tacsi;
    }

    public Tacsko(String color, String name, Person gazdi, String tacsi) {
        super(color, name, gazdi);
        this.tacsi = tacsi;
    }
}
