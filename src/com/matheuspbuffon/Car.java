package com.matheuspbuffon;

public class Car {

    double mileage;
    int price;
    int doors;

    public Car() {
        /*this.mileage = 5.23;
        this.price = 50000;
        this.doors = 4;*/
        this(5.23, 50000, 4);
    }

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
