package org.example;

public class TurboCar extends Car {
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
}
