package com.quedacoder;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Lamp lamp = new Lamp("Classic", false, 75);
        Ceiling ceiling = new Ceiling(12, "white");
        Bed bed = new Bed("Modern", 4, 3,2,1);

        Bedroom bedroom = new Bedroom("Leons", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
