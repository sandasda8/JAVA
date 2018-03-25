public class Csirke extends SzarazfoldiAllat implements Novenyevo {
    public Csirke(String nev) {
        super(nev);
        setLabakSzama(2);
    }
    @Override
    public void eszik() {
        System.out.println(this.getNev() + " jóllakott magvakkal.");
        this.setJollakottsag(100);
    }
    @Override
    public String hangotAd() {
        return "kott kott";
    }
}