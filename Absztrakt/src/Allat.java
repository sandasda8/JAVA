public abstract class Allat {
    private String nev;
    private int jollakottsag;
    private int ero;

    public Allat(String nev) {
        this.nev = nev;
        this.jollakottsag = 100;
        this.ero = 0;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getJollakottsag() {
        return jollakottsag;
    }

    public void setJollakottsag(int jollakottsag) {
        this.jollakottsag = jollakottsag;
    }

    public int getEro() {
        return ero;
    }

    public String getNev() {
        return nev;
    }

    public void setEro(int ero) {
        this.ero = ero;
    }

    public abstract String hangotAd();
}
