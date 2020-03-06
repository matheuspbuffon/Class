package com.matheuspbuffon;

public class Car {

    private double mileage;
    private int price;
    private int doors;

    /*public Car() {
        this.mileage = 5.23;
        this.price = 50000;
        this.doors = 4;
        this(5.23, 50000, 4);
    }*/

    public Car(double mileage, int price, int doors) {
        this.mileage = mileage;
        this.price = price;
        this.doors = doors;
    }

    public String carStart() {
        return "Car Started";
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void carShutOff() {
        System.out.println("Car Engine Off");
    }
}
