package com.sda.java18.builder;

class CarBuilderImpl implements CarBuilder {

    private String color;
    private int wheels;

    public CarBuilderImpl() {

    }

    @Override
    public Car build() {
        Car car = new Car(wheels, color);
        return car;
    }

    @Override
    public CarBuilder setColor(final String color) {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder setWheels(final int wheels) {
        this.wheels = wheels;
        return this;
    }
}
