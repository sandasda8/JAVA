package org.flow.designpatterns.strategy;

public class Bus extends PublicTransportStrategy {
    @Override
    protected void specTravel() {
        System.out.println("Travelling by bus.");
    }
}
