package org.example;

public class UsualCar extends Car implements SuperCar, MadeInCountry {
    @Override
    public String engineType() {
        return "Turbo mode is not available";
    }

    public UsualCar(String name) {
        super(name);
    }

    @Override
    public boolean isSuperCar() {
        return false;
    }

    @Override
    public String getCountry() {
        return "Ukraine";
    }
}
