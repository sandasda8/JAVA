
public class ObserverMain {
    public static void main(String[] args) {
        Character shrek = new Character("Shrek", "Swamp");
        Character donkey = new Character("Donkey", "Szabadka");

        Carriage carriage = new Carriage();

        carriage.addObserver(shrek);
        carriage.addObserver(donkey);
        carriage.arrived("Rivendell");
        carriage.arrived("Moria");
        carriage.arrived("Far and Away");
        carriage.arrived("Swamp");
        carriage.arrived("Szabadka");

    }
}
