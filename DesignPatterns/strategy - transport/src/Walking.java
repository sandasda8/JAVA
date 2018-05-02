package org.flow.designpatterns.strategy;

public class Walking implements TravelStrategy {
    @Override
    public void go() {
        System.out.println("Walkiiiiing.");
    }
}
