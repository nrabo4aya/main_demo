package org.example;

public class Main {
    public static void main(String[] args) {
        Car model = new Car("Vehicle");
        String usualCar = model.engineType();
        System.out.println(usualCar);

        UsualCar opel = new UsualCar("Opel");
        String usualModel = opel.engineType();
        System.out.println(usualModel);

        TurboCar maserati = new TurboCar("Maserati");
        String turboCar = maserati.engineType();
        System.out.println(turboCar);

        maserati.engineSound();



    }
}