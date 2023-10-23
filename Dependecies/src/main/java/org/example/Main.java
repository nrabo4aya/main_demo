package org.example;

public class Main {
    public static void main(String[] args) {
        Car model = new Car();
        String usualCar = model.engineType();
        System.out.println(usualCar);

        UsualCar opel = new UsualCar();
        String usualModel = opel.engineType();
        System.out.println(usualModel);

        TurboCar maserati = new TurboCar();
        String turboCar = maserati.engineType();
        System.out.println(turboCar);






//        Car turboCar = new Car();
//        turboCar.Start();
//        turboCar.maxSpeed = 260;
//        turboCar.Accelerate(261);
//        turboCar.Color();
//
//        turboCar.turboEngine();
//        String turboEngine = turboCar.turboEngine();
//        System.out.println(turboEngine);
//
//        UsualCar opel = new UsualCar();
//        opel.turboEngine();
//
//        Car usualCar = new Car();
//        usualCar.maxSpeed = 120;
//        usualCar.Accelerate(110);
//        String usualEngine = usualCar.turboEngine();
//        System.out.println(turboEngine);

    }
}