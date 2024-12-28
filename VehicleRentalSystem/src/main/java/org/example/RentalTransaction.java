package org.example;
import java.time.LocalDate;

public class RentalTransaction {

    private Customer customer;
    private int rentalDays;
    private Vehicle vehicle;
    private double rentalCost;
    private LocalDate startDate;
    private LocalDate endDate;

    public RentalTransaction(Customer customer, Vehicle vehicle, int rentalDays, double rentalCost) {
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.rentalCost = rentalCost;
        this.startDate = LocalDate.now();
        this.endDate = startDate.plusDays(rentalDays);
        this.vehicle = vehicle;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
