package com.sda.java18.builder;

class Car {
    private int wheels;
    private String color;

    Car(int wheels, String color) {
        this.wheels = wheels;
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public int getWheels() {
        return wheels;
    }


    @Override
    public String toString() {
        return "Car [wheels = " + wheels + ", color = " + color + "]";
    }
}
