public class Main {
    public static void main(String[] args) {
        ember Jozsi = new ember("Endre", 20, true);
        ember Katika = new ember("Kata", 34, false);
        System.out.println(Jozsi);
        System.out.println(Katika.nev);
        Jozsi.greetings();
        Katika.greetings();
        System.out.println(ember.letrehozasokszama);
        Jozsi.kocsmabamegy();
    }
}
