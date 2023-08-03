package com.workintech.carRandD;

public class HybridCar extends CarSkeleton{
private  double avgKmPerLitre;
private int batterSize;
private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterSize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterSize = batterSize;
        this.cylinders = cylinders;
    }
}
