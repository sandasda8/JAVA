public class Aszu extends Bor{
    private int puttony;

    public Aszu(String iz, double alkoholTartalom, String szoloFajta, String termoTerulet, int puttony) {
        super("aszu ízű", alkoholTartalom, "aszunak való szőlő", "Tokaj");
        this.puttony = puttony;
    }

    public int hanyPuttonyos(){
        return puttony;
    }

    @Override
    public String toString() {
        return "Aszu{" +
                "puttony=" + puttony +
                '}';
    }
}
