package com.matheuspbuffon;

public class Main {

    public static void main(String[] args) {
        Car benz = new Car(10.54, 30000, 4);
        Car audi = new Car();

        DirtCar dirtyBenz = new DirtCar();
        dirtyBenz.setMileage(6);
        dirtyBenz.setDoors(2);
        dirtyBenz.setPrice(250000);
        dirtyBenz.setDirtyTerrainTopSpeed(45);

        System.out.println(dirtyBenz.startDirtCar());
        System.out.println("Dirty Benz's mileage is "+ dirtyBenz.getMileage());
        System.out.println("Dirty Benz's doors count is "+ dirtyBenz.getDoors());
        System.out.println("Dirty Benz's price is "+ dirtyBenz.getPrice());
        System.out.println("Dirty Benz's terrain top speed is "+ dirtyBenz.getDirtyTerrainTopSpeed());

        /*System.out.println("Benz has "+ benz.getDoors() +" doors");
        System.out.println("Benz is priced at "+ benz.getPrice() +" dollars");
        System.out.println("The mileage being: "+ benz.getMileage());

        benz.carStart();
        benz.carShutOff();

        System.out.println("Audi has "+ audi.getDoors() +" doors.");
        System.out.println("Audi is priced at: "+ audi.getPrice() +" dollars.");
        System.out.println("The mileage being: "+ audi.getMileage());*/
    }
}
