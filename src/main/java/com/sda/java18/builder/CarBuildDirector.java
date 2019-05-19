package com.sda.java18.builder;

public class CarBuildDirector {
    private CarBuilder builder;

    public CarBuildDirector(final CarBuilder builder) {
        this.builder = builder;
    }

    public Car construct() {

        CarBuilder carBuilder = builder.setWheels(4);
        carBuilder = carBuilder.setColor("Red");
        Car car = carBuilder.build();

        return builder.setWheels(4)
                .setColor("Red")
                .build();
    }

    public static void main(final String[] arguments) {
        final CarBuilder builder = new CarBuilderImpl();

        final CarBuildDirector carBuildDirector = new CarBuildDirector(builder);

        System.out.println(carBuildDirector.construct());
    }
}
