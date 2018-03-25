public class Medve extends SzarazfoldiAllat implements Ragadozo {
    public Medve(String nev) {
        super(nev);
        setLabakSzama(4);
    }

    public void eszik(Allat allat) {
        System.out.println(this.getNev() + " evett egy " + allat.getNev());
        this.setJollakottsag(100);
    }

    public void pihenes(int mennyit) {
        System.out.println(this.getNev() + " pihent.");
        this.setEro(100);
    }

    @Override
    public String hangotAd() {
        return "brum-brum";
    }
}

