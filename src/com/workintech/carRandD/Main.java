package com.workintech.carRandD;

public class Main {
    public static void main(String[] args) {
        CarSkeleton car1 = new ElectricCar("Alfa", "italyan", 100, 10);
        CarSkeleton car2 = new GasPoweredCar("Volvo", "amerikan", 0.08, 4);
        CarSkeleton car3 = new HybridCar("toyota","japon",4.5,10,2);
        car1.drive();
        car2.drive();
        car3.drive();
    }}
