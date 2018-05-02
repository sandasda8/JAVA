public class SzulinapiTorta extends Torta {
    private int gyertyakSzama;
    public SzulinapiTorta(int szelet, String iz, int gyertyakSzama) {
        super(szelet, iz);
        this.gyertyakSzama = gyertyakSzama;
    }
    public void kivansagotTeljesit() {
        System.out.println("Kívánságod teljesült!");
    }
    public void info() {
        System.out.println("Ez a szülinapi torta " + this.getIz() + " íz, és "
                + this.szelet + " szeletes." + this.gyertyakSzama
                + " db gyertya van rajta");
    }
}
