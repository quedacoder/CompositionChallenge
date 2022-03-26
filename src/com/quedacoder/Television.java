package com.quedacoder;

public class Television {

    private String brand;
    private int size;

    public Television(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public void turnOn() {
        System.out.println("Television Turned on");
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }
}
