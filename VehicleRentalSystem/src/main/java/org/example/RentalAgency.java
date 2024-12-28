package org.example;
import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private final List<Vehicle> vehicles;

    public RentalAgency() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public Vehicle findVehicleById(String vehicleId) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                return vehicle;
            }
        }
        return null;
    }

    public RentalTransaction rentVehicle(Customer customer, Vehicle vehicle, int days) {
        if (vehicle.isAvailableForRental()) {
            double cost = vehicle.calculateRentalCost(days);
            RentalTransaction transaction = new RentalTransaction(customer, vehicle, days, cost);
            customer.addRentalTransaction(transaction);
            vehicle.setAvailable(false);
            return transaction;
        } else {
            // Handle vehicle not available case (e.g., throw an exception)
            return null;
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.setAvailable(true);
    }

}
