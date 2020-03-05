package com.matheuspbuffon;

public class DirtCar extends Car {

    private int dirtyTerrainTopSpeed;

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
