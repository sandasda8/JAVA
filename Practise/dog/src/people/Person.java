package people;

import java.io.*;
import java.util.*;

public class Person implements Comparable<Person>{
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
                ", age=" + age +
                ", tailWiggle=" + tailWiggle +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTailWiggle() {
        return tailWiggle;
    }

    public void setTailWiggle(int tailWiggle) {
        this.tailWiggle = tailWiggle;
    }
    public int compareTo(Person object){
        Person person = (Person) object;
        if(this.age==object.age)
            return 0;
        else if(this.age>object.age)
            return 1;
        else
            return -1;
    }
    public int compareToName(Person object){
        Person person = (Person) object;
        if(name.equals(object.name))
            return 0;
        else if(name.compareTo(object.name) > 0)
            return 1;
        else
            return -1;
    }
}
