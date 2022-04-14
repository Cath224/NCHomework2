package com.netcracker.homework.ch2.ex9;

public class Car {
    private double x;
    private int fuelEfficiency;
    private double fuelLevel;

    public Car(double x, int fuelEfficiency, double fuelLevel) {
        this.x = x;
        this.fuelEfficiency = fuelEfficiency;
        this.fuelLevel = fuelLevel;
    }

    public void move(int motion , double distance) {
        double nowDistance=0;
        double allDistance=0;

        while (allDistance < distance) {
            this.x += motion;
            this.fuelLevel -= motion * fuelEfficiency;

            allDistance +=motion;

            if (this.fuelLevel <= 0) {
                nowDistance= distanceStop(nowDistance);
                addFuel(100);
                this.x = 0;
            }
        }

    }

    public double distanceStop(double nowDistance)
    {
        nowDistance += this.x;
        System.out.println("Stopped and fueled the car for the distance: " + nowDistance);
        return nowDistance;
    }

    public void addFuel(int gasAmount ){
        this.fuelLevel += gasAmount+Math.abs(fuelLevel);
    }

}
