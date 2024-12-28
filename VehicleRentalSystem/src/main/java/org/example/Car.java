package org.example;

import java.util.Objects;

public class Car extends Vehicle {
    private String color;
    private final boolean hasAC;

    public Car(String vehicleId, String model, double baseRentalRate, String color, boolean hasAC, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.color = color;
        this.hasAC = hasAC;
    }

    @Override
    public double calculateRentalCost(int days) {
        double rentalCost = super.getBaseRentalRate() * days;
        if (hasAC) rentalCost += 20;
        return rentalCost;
    }

    @Override
    public boolean isAvailableForRental() {
        return this.isAvailable();
    }

    @Override
    public String toString() {
        return "Vehicle ID is " + getVehicleId() + "and Model is " + getModel();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return hasAC == car.hasAC && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, hasAC);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasAC() {
        return hasAC;
    }
}
