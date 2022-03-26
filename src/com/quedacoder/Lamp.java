package com.quedacoder;

public class Lamp {

    private int height;
    private int width;
    private int numberOfBulbs;

    public Lamp(int height, int width, int numberOfBulbs) {
        this.height = height;
        this.width = width;
        this.numberOfBulbs = numberOfBulbs;
    }

    public void turnOnLamp() {
        System.out.println("Lamp turned on");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getNumberOfBulbs() {
        return numberOfBulbs;
    }
}
