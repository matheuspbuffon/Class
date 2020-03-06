package com.matheuspbuffon;

public class DirtCar extends Car {

    private int dirtyTerrainTopSpeed;

    public DirtCar(double mileage, int price, int doors, int dirtyTerrainTopSpeed) {

        super(mileage, price, doors);
        this.dirtyTerrainTopSpeed = dirtyTerrainTopSpeed;
    }

    public int getDirtyTerrainTopSpeed() {
        return dirtyTerrainTopSpeed;
    }

    public void setDirtyTerrainTopSpeed(int dirtyTerrainTopSpeed) {
        this.dirtyTerrainTopSpeed = dirtyTerrainTopSpeed;
    }

    public String startDirtCar() {
        return "" + super.carStart();
    }
}
