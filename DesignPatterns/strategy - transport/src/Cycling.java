package org.flow.designpatterns.strategy;

public class Cycling implements TravelStrategy {
    @Override
    public void go() {
        System.out.println("Cycliiiiiing.");
    }
}
