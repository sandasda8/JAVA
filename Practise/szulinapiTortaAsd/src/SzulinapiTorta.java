public class SzulinapiTorta extends Torta {
    private int gyergyakSzama = 0;

    @Override
    public String toString() {
        return "SzulinapiTorta{" +
                "gyergyakSzama=" + gyergyakSzama +
                '}';
    }

    public SzulinapiTorta(int szelet, String iz, int gyergyakSzama) {
        super(szelet, iz);
        this.gyergyakSzama = gyergyakSzama;

    }

}