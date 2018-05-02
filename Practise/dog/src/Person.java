import java.io.Serializable;

public class Person implements Serializable{
    private int id;
    private String name;
    private int age;
    private int tailWiggle;

    public Person(int id, String name, int age, int tailWiggle) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tailWiggle = tailWiggle;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
