package org.example;

public class UsualCar extends Car {
    @Override
    public String engineType() {
        return "Turbo mode is not available";
    }

    public UsualCar(String name) {
        super(name);
    }
}
