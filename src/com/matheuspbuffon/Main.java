package com.matheuspbuffon;

public class Main {

    public static void main(String[] args) {

        DirtCar dirtyBenz = new DirtCar(20.5, 50000, 6, 50);

        System.out.println(dirtyBenz.startDirtCar());
        System.out.println("Dirty Benz's mileage is "+ dirtyBenz.getMileage());
        System.out.println("Dirty Benz's doors count is "+ dirtyBenz.getDoors());
        System.out.println("Dirty Benz's price is "+ dirtyBenz.getPrice());
        System.out.println("Dirty Benz's terrain top speed is "+ dirtyBenz.getDirtyTerrainTopSpeed());
    }
}
