import java.util.Objects;
import java.io.Serializable;

public class Dog extends Animal implements Serializable{
    private String color;
    private String name;
    private Person gazdi;

    public Dog(String color, String name) {
        this.color = color;
        this.name = name;

    }

    public Dog(String color, String name, Person gazdi) {
        this.color = color;
        this.name = name;
        this.gazdi = gazdi;
    }

    /*
        public boolean equals (Object o){
            if(o == null ){
                return false;
            } else if (o instanceof Dog) {
                if (((Dog) o).getColor().equals(this.getColor())) {
                    return true;
                }
            }
            return false;
        }
    */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", gazdi=" + gazdi +
                '}';
    }

 /*
    @Override
    public int hashCode(){
        return this.getColor().length();
    }
    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;

        Dog dog = (Dog) o;

        if (!color.equals(dog.color)) return false;
        return name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
}
