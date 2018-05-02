package org.flow.designpatterns.strategy;

public class Person {
    private String name;
    private TravelStrategy strategy;

    public Person(String name, TravelStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TravelStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void travel() {
        strategy.go();
    }
}
