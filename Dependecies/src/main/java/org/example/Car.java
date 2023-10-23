package org.example;

public class Car {
    public String name;

    public Car(String name) {
        this.name = name;
    }

    public int maxSpeed;
    public void Color (){
        System.out.println("The color is pink");
    };

    public void Start (){
        System.out.println("Engine started");
    }

    public void Accelerate (int speed){
        if (speed <= maxSpeed)
            System.out.println("Speed increased to " + speed);
        else
            System.out.println("Speed is to high!");
    }
    public String getCarName(){
        return name;
    }
    public String engineType(){
        return "Type of engine";

    }
}
