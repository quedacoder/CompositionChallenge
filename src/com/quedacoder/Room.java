package com.quedacoder;

public class Room {

    private NorthWall northWall;
    private SouthWall southWall;
    private WestWall westWall;
    private EastWall eastWall;
    private Furniture furniture;
    private Television television;
    private Lamp lamp;

    public Room(NorthWall northWall, SouthWall southWall, WestWall westWall, EastWall eastWall, Furniture furniture, Television television, Lamp lamp) {
        this.northWall = northWall;
        this.southWall = southWall;
        this.westWall = westWall;
        this.eastWall = eastWall;
        this.furniture = furniture;
        this.television = television;
        this.lamp = lamp;
    }

    public NorthWall getNorthWall() {
        return northWall;
    }

    public SouthWall getSouthWall() {
        return southWall;
    }

    public WestWall getWestWall() {
        return westWall;
    }

    public EastWall getEastWall() {
        return eastWall;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public Television getTelevision() {
        return television;
    }

    public void turnOnLights() {
        lamp.turnOnLamp();
    }
}
