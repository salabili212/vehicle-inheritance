package com.plurasight;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Red",34,5,9);
        Moped moped = new Moped("Red",34,5,9);
        SemiTruck semiTruck = new SemiTruck("Red",34,5,9);
        Hovercraft hovercraft = new Hovercraft("Red",34,5,9);

        car.setColor("Red");
        car.setFuelCapacity(5);
        moped.setColor("Blue");
        car.setFuelCapacity(10);
        semiTruck.setColor("white");
        car.setFuelCapacity(8);
        hovercraft.setColor("Gray");
        car.setFuelCapacity(9);

        System.out.println(car.getColor());

        // be




    }
}
