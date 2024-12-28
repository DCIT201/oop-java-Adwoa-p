package org.example;

import java.util.Objects;

public class Motorcycle extends Vehicle {
    private String motorcycleType;
    private double fuelEfficiency;

    public Motorcycle(String vehicleId, String model, double baseRentalRate,boolean isAvailable, String motorcycleType, double fuelEfficiency) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.motorcycleType = motorcycleType;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public double calculateRentalCost(int days){
        double cost = super.getBaseRentalRate() * days;
        return cost;
    }

    @Override
    public boolean isAvailableForRental(){
        return this.isAvailable();
    }

    public String getMotorcycleType() {
        return motorcycleType;
    }

    public void setMotorcycleType(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Motorcycle that = (Motorcycle) o;
        return Double.compare(fuelEfficiency, that.fuelEfficiency) == 0 && Objects.equals(motorcycleType, that.motorcycleType);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "motorcycleType='" + motorcycleType + '\'' +
                ", fuelEfficiency=" + fuelEfficiency +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(motorcycleType, fuelEfficiency);
    }
}
