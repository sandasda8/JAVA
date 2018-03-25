public class Main {
    public static void main (String[] args) {

        Allat pipi = new Csirke("Sanyi");
        Allat pipi1 = new Csirke("Zoli");
        Allat pipi2 = new Csirke ("Peti");
        System.out.println(pipi.hangotAd());
        Allat medve = new Medve("Feri");
        Allat medve1 = new Medve("Gusztav");
        Allat medve2 = new Medve("Bob");
        System.out.println(medve.hangotAd());
        Allat hal = new Hal ("Imre");
        Allat hal1 = new Hal ("Jozsi");
        Allat hal2 = new Hal ("Goldy");
        System.out.println(hal.hangotAd());
        Allat tigris = new Tigris ("Charlie");
        Allat tigris1 = new Tigris ("Hobo");
        Allat tigris2 = new Tigris ("Bill");
        System.out.println(tigris.hangotAd());
        Allat[] allatok = new Allat[]{pipi, pipi1, pipi2, medve, medve1, medve2, hal, hal1, hal2, tigris, tigris1, tigris2};
        for (int i = 0; i < allatok.length; i++) {
            System.out.println(allatok[i].getClass());
        }
       /* Ragadozo[] ragadozok = new Ragadozo[]{medve, medve1, medve2, tigris, tigris1, tigris2};
        Novenyevo[] novenyevok = new Novenyevo[]{pipi, pipi1, pipi2, hal, hal1, hal2};
        SzarazfoldiAllat[] szarazfolniAllatok = new SzarazfoldiAllat[]{pipi, pipi1, pipi2, medve, medve1, medve2, tigris, tigris1, tigris2};
        ViziAllat[] viziAllatok = new ViziAllat[]{hal, hal1, hal2}; */

        for (int i = 0; i < allatok.length; i++) {
            if (allatok[i].getClass() == Tigris.class) {
                System.out.println(allatok[i].toString());
            } else if (allatok[i].getClass() == Medve.class) {
                System.out.println(allatok[i].toString());
            } else if (allatok[i].getClass() == Hal.class) {
                System.out.println(allatok[i].toString());
            } else {
                System.out.println(allatok[i].toString());
            }
        }
    }
}
