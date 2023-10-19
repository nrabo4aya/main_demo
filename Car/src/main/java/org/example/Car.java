package org.example;

public class Car {
    public String name;
    public int maxSpeed;
    public String Color;

    public void Start (){
        System.out.println("Engine started");
    }
//    public void Color (String color){
//        System.out.println("The color is pink");
//    }
    public void Accelerate (int speed){
        if (speed <= maxSpeed)
            System.out.println("speed increased to " + speed);
        else
            System.out.println("Speed is to high!");
    }
    public String getCarname(){
        return name;
    }
}
