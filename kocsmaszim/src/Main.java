public class Main {
    public static void main(String[] args) {
        Torta csokiTorta = new SzulinapiTorta(15, "csoki", 9);
        Torta[] cukraszda = new Torta[3];
        cukraszda[0] = new Torta(20, "csokis-meggyes");
        cukraszda[1] = new Torta(12, "epres");
        cukraszda[2] = new SzulinapiTorta(12, "karamell", 12);
        for (int i = 0; i < cukraszda.length; i++) {
            cukraszda[i].info();
        }
    }
}
