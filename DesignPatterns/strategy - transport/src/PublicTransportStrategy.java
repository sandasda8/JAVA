package org.flow.designpatterns.strategy;

// Template method
public abstract class PublicTransportStrategy implements TravelStrategy{
    @Override
    public void go() {
        System.out.println("Get on.");
        System.out.println("Buy ticket");
        specTravel();
        System.out.println("Get off.");
    }

    protected abstract void specTravel();
}
