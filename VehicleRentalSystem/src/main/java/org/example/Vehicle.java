package org.example;

public abstract class Vehicle implements Rentable{
    protected String vehicleId;
    protected String model;
    protected boolean isAvailable;
    protected double baseRentalRate;

    public Vehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        if (baseRentalRate<=0){
            throw new IllegalArgumentException("Rental Rate must be greater than zero");
        }
        this.baseRentalRate = baseRentalRate;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public abstract boolean isAvailableForRental();

    public abstract double calculateRentalCost(int days);


    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            isAvailable = false;
            System.out.println(model + " (ID: " + vehicleId + ") rented by " + customer.getCustomerName() + " for " + days + " days.");
        } else {
            System.out.println(model + " (ID: " + vehicleId + ") is already rented.");
        }
    }

    @Override
    public void returnVehicle() {
        if (!isAvailableForRental()) {
            isAvailable = true;
            System.out.println(model + " (ID: " + vehicleId + ") has been returned.");
        } else {
            System.out.println(model + " (ID: " + vehicleId + ") is not currently rented.");
        }
    }
}
