import VendingMachine.*;

public class Distributor {

    private static void information(DrinkVendingMachine DrinkVendingMachine){
        System.out.println("Number of cups left:  " + DrinkVendingMachine.getCups());
        System.out.println("Total money: " + DrinkVendingMachine.getMoneyIn());
    }

    public static void main(String[] args) {

        DrinkVendingMachine machine = new DrinkVendingMachine(Integer.parseInt(args[0]), Boolean.parseBoolean(args[1]));
        System.out.println(machine.toString());
        machine.putMoneyIn(100);
        machine.putMoneyIn(100);
        machine.putMoneyIn(10);
        information(machine);
    }
}
