public class AlkoholosItal extends Italok implements Alkoholos{

    private String iz;
    private double alkoholTartalom;

    public AlkoholosItal(String iz, double alkoholTartalom) {
        this.iz = iz;
        this.alkoholTartalom = alkoholTartalom;
    }

    public String getIz() {
        return iz;
    }

    public void setIz(String iz) {
        this.iz = iz;
    }

    public double getAlkoholTartalom() {
        return alkoholTartalom;
    }

    public void setAlkoholTartalom(double alkoholTartalom) {
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public double mennyiAlkoholtTartalmaz(){
        return alkoholTartalom;
    }

    @Override
    public String toString() {
        return "AlkoholosItal{" +
                "iz='" + iz + '\'' +
                ", alkoholTartalom=" + alkoholTartalom +
                '}';
    }
}
}
