package org.flow.designpatterns.strategy;

public class Tram extends PublicTransportStrategy {
    @Override
    protected void specTravel() {
        System.out.println("Travelling by tram.");
    }
}
