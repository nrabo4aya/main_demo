package org.example;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.maxSpeed = 120;

        System.out.println(myCar.hashCode());
        myCar.Start();
        myCar.Accelerate(121);


        Car myCar1 = new Car();
        myCar1.maxSpeed = 160;
        System.out.println(myCar1.hashCode());
        myCar1.Start();
        myCar1.Accelerate(160);



    }
}