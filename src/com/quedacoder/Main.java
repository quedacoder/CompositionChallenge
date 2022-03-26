package com.quedacoder;

public class Main {

    public static void main(String[] args) {

        WestWall westWall = new WestWall(new Dimensions(12, 10), true, false, "white");
        NorthWall northWall = new NorthWall(new Dimensions(12, 10), false, true, "white");
        SouthWall southWall = new SouthWall(new Dimensions(12, 10), false, true, "white");
        EastWall eastWall = new EastWall(new Dimensions(12, 10), false, true, "white");
        Furniture bed = new Furniture("Queen Bed");
        Television visio = new Television("visio", 55);
        Lamp lamp = new Lamp(3, 2, 4);

        Room bedRoom = new Room(northWall,southWall,westWall,eastWall,bed, visio, lamp);
        bedRoom.getTelevision().turnOn();
        bedRoom.turnOnLights();
    }
}
