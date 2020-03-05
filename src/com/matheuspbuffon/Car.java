package com.matheuspbuffon;

public class Car {

    double mileage;
    int price;
    int doors;

    public Car(double mileage, int price, int doors) {
        this.mileage = mileage;
        this.price = price;
        this.doors = doors;
    }

    public void carStart() {
        System.out.println("Car Started");
    }

    public void carShutOff() {
        System.out.println("Car Engine Off");
    }
}
