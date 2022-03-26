package com.quedacoder;

public class Wall {
    private Dimensions dimensions;
    private boolean isWindowPresent;
    private boolean isPlugPresent;
    private String color;

    public Wall(Dimensions dimensions, boolean isWindowPresent, boolean isPlugPresent, String color) {
        this.dimensions = dimensions;
        this.isWindowPresent = isWindowPresent;
        this.isPlugPresent = isPlugPresent;
        this.color = color;
    }

    public boolean isPlugPresent() {
        return isPlugPresent;
    }

    public String getColor() {
        return color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean isWindowPresent() {
        return isWindowPresent;
    }
}
