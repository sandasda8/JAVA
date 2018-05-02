package org.flow.designpatterns.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        Person joe = new Person("Joe", new Walking());
        joe.travel();
        joe.setStrategy(new Cycling());
        joe.travel();
        System.out.println();
        joe.setStrategy(new Tram());
        joe.travel();
        System.out.println();
        joe.setStrategy(new Bus());
        joe.travel();
    }
}
