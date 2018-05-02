package Warehouse;
import java.io.*;

public abstract class Inventory implements Product {

    public static void main(String[] args) {

        int stepper = 0;
        int warehouseStepper = 0;
        Product[] warehouse = new Product[3];

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("/home/attila/IdeaProjects/aru/src/Warehouse/input.csv"));
            String scannedLine;
            while ((scannedLine = br.readLine()) != null) {
                if ( stepper > 0 ) {
                    String[] splittedLine = scannedLine.split(";");
                    if ( splittedLine[0].equals("Gy") ) {
                        warehouse[warehouseStepper] = new Fruit(splittedLine[1]);
                        warehouseStepper++;
                    } else if ( splittedLine[0].equals("T") ) {
                        warehouse[warehouseStepper] = new MilkProduct(Long.parseLong(splittedLine[1]), Long.parseLong(splittedLine[2]), splittedLine[3]);
                        warehouseStepper++;
                    }
                }
                stepper++;
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedWriter self = null;
        BufferedWriter bin = null;

        try {
            self = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/home/attila/IdeaProjects/aru/src/Warehouse/shelf.csv"), "utf-8"));

            bin = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/home/attila/IdeaProjects/aru/src/Warehouse/bin.csv"), "utf-8"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            for (Product product: warehouse) {
                if ( product.isItGood ()) {
                    self.write(product.toString() + "\n");
                } else {
                    bin.write(product.toString() + "\n");
                }
            }

        } catch (IOException | BadQuality e) {
            e.printStackTrace();
        } finally {
            try {
                self.flush();
                bin.flush();
                self.close();
                bin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}