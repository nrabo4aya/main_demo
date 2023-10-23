package org.example;

public class TurboCar extends Car implements SuperCar, MadeInCountry {
    @Override
    public String engineType() {
        return "Turbo mode is available";
    }
    public void engineSound(){
        System.out.println("High volume");

    }

    public TurboCar(String name) {
        super(name);
    }

    @Override
    public boolean isSuperCar() {
        return true;
    }

    @Override
    public String getCountry() {
        return "Italy";
    }
}
