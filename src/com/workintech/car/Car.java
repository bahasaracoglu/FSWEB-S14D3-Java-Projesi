package com.workintech.car;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        engine = true;
        wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    public String startEngine() {
        String result = getClass().getSimpleName() + " engine is starting.";
        return result;
    }

    public String accelerate() {
        String result = getClass().getSimpleName() + " is accelerating.";
        return result;
    }

    public String brake() {
        String result = getClass().getSimpleName() + " is breaking.";
        return result;
    }

}
