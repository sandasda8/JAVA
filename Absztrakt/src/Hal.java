public class Hal extends ViziAllat implements Novenyevo {
    public Hal(String nev) {
        super(nev);
    }
    @Override
    public void eszik() {
        System.out.println(this.getNev() + " jóllakott gilisztával.");
        this.setJollakottsag(100);
    }
}