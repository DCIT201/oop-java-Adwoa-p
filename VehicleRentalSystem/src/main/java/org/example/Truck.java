package org.example;
import java.util.Objects;

public class Truck extends Vehicle {
    private String truckType;
    private double speedCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate,boolean isAvailable, double speedCapacity, String truckType) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.truckType = truckType;
        this.speedCapacity = speedCapacity;
    }

    @Override
    public double calculateRentalCost(int days){
        double rentalCost = super.getBaseRentalRate() * days;
        if (this.truckType.equals("Pickup")) {
            rentalCost += 20;
        }
        return rentalCost;
    }

    @Override
    public boolean isAvailableForRental(){
        return this.isAvailable();
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public double getSpeedCapacity() {
        return speedCapacity;
    }

    public void setSpeedCapacity(double speedCapacity) {
        this.speedCapacity = speedCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return Double.compare(speedCapacity, truck.speedCapacity) == 0 && Objects.equals(truckType, truck.truckType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(truckType, speedCapacity);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "truckType='" + truckType + '\'' +
                ", speedCapacity=" + speedCapacity +
                '}';
    }
}
