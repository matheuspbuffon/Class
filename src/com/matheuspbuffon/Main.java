package com.matheuspbuffon;

public class Main {

    public static void main(String[] args) {
        Car benz = new Car(10.54, 30000, 4);
        Car audi = new Car();

        System.out.println("Benz has "+ benz.doors +" doors");
        System.out.println("Benz is priced at "+ benz.price +" dollars");
        System.out.println("The mileage being: "+ benz.mileage);

        benz.carStart();
        benz.carShutOff();

        System.out.println("Audi has "+ audi.doors +" doors.");
        System.out.println("Audi is priced at: "+ audi.price +" dollars.");
        System.out.println("The mileage being: "+ audi.mileage);
    }
}
