package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RentalTransactionTest {
    @Test
    void getVehicle() {
        Vehicle vehicle = new Car("V001", "Toyota Corolla", 50.0, "Green", true, false);
        RentalTransaction transaction = new RentalTransaction(null, vehicle, 5, 250.0);
        assertEquals(vehicle, transaction.getVehicle());
    }

    @Test
    void setVehicle() {
        Vehicle vehicle1 = new Truck("T001", "Hyundai", 50.0, true, 1000, "Pickup");
        Vehicle vehicle2 = new Motorcycle("M002", "Honda", 60.0, true,"Sports", 80.0);
        RentalTransaction transaction = new RentalTransaction(null, vehicle1, 5, 250.0);
        transaction.setVehicle(vehicle2);
        assertEquals(vehicle2, transaction.getVehicle());
    }

    @Test
    void getRentalCost() {
        RentalTransaction transaction = new RentalTransaction(null, null, 5, 250.0);
        assertEquals(250.0, transaction.getRentalCost());
    }

    @Test
    void setRentalCost() {
        RentalTransaction transaction = new RentalTransaction(null, null, 5, 250.0);
        transaction.setRentalCost(300.0);
        assertEquals(300.0, transaction.getRentalCost());
    }

    @Test
    void getRentalDays() {
        RentalTransaction transaction = new RentalTransaction(null, null, 5, 250.0);
        assertEquals(5, transaction.getRentalDays());
    }

    @Test
    void setRentalDays() {
        RentalTransaction transaction = new RentalTransaction(null, null, 5, 250.0);
        transaction.setRentalDays(7);
        assertEquals(7, transaction.getRentalDays());
    }

    @Test
    void getStartDate() {
        LocalDate now = LocalDate.now();
        RentalTransaction transaction = new RentalTransaction(null, null, 5, 250.0);
        assertEquals(now, transaction.getStartDate());
    }

    @Test
    void setStartDate() {
        RentalTransaction transaction = new RentalTransaction(null, null, 5, 250.0);
        LocalDate newDate = LocalDate.of(2024, 1, 1);
        transaction.setStartDate(newDate);
        assertEquals(newDate, transaction.getStartDate());
    }

    @Test
    void getEndDate() {
        LocalDate now = LocalDate.now();
        RentalTransaction transaction = new RentalTransaction(null, null, 5, 250.0);
        assertEquals(now.plusDays(5), transaction.getEndDate());
    }

    @Test
    void setEndDate() {
        RentalTransaction transaction = new RentalTransaction(null, null, 5, 250.0);
        LocalDate newDate = LocalDate.of(2024, 1, 6);
        transaction.setEndDate(newDate);
        assertEquals(newDate, transaction.getEndDate());
    }

    @Test
    void getCustomer() {
        Customer customer = new Customer("12345", "John Doe", "0987654321" );
        RentalTransaction transaction = new RentalTransaction(customer, null, 5, 250.0);
        assertEquals(customer, transaction.getCustomer());
    }

    @Test
    void setCustomer() {
        Customer customer1 = new Customer("12345", "John Doe", "0987654321" );
        Customer customer2 = new Customer("22345", "Jane Doe", "0123456789" );
        RentalTransaction transaction = new RentalTransaction(customer1, null, 5, 250.0);
        transaction.setCustomer(customer2);
        assertEquals(customer2, transaction.getCustomer());
    }
}