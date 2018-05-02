public class ember {
     String nev;
     int kor;
     boolean gender;
     static int letrehozasokszama = 0;

    public String toString () {
        return "az ember neve " + nev + " az ember kora " + kor + " az ember gendere " + gender;
    }

    public ember(String nev, int kor, boolean gender){
        this.nev = nev;
        this.kor = kor;
        this.gender = gender;
        letrehozasokszama ++;
    }
    public void greetings() {
        if (gender) {
            System.out.println("Hello, ferfi vagyok.");
        }else{
            System.out.println("Hello, no vagyok.");
        }
    }
    public static void kocsmabamegy() {
        System.out.println("elmentem inni");
    }
}

