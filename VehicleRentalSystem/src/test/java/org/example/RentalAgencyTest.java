package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentalAgencyTest {

    @Test
    void addVehicle() {
        RentalAgency agency = new RentalAgency();
        Vehicle vehicle = new Car("C001", "Toyota", 50.0, "Grey", true, false);
        agency.addVehicle(vehicle);

        assertEquals(vehicle, agency.findVehicleById("C001"));
    }

    @Test
    void findVehicleById() {
        RentalAgency agency = new RentalAgency();
        Vehicle vehicle = new Car("C002", "Honda", 40.0, "Yellow", false, true);
        agency.addVehicle(vehicle);

        Vehicle foundVehicle = agency.findVehicleById("C002");
        assertNotNull(foundVehicle);
        assertEquals("C002", foundVehicle.getVehicleId());
        assertNull(agency.findVehicleById("INVALID_ID"));
    }

    @Test
    void rentVehicle() {
        RentalAgency agency = new RentalAgency();
        Customer customer = new Customer("12345", "John Doe", "0245672348");
        Vehicle vehicle = new Car("C003", "Nissan", 60.0, "White", false, true);
        agency.addVehicle(vehicle);

        RentalTransaction transaction = agency.rentVehicle(customer, vehicle, 3);
        assertNotNull(transaction);
        assertEquals(vehicle, transaction.getVehicle());
        assertEquals(180.0, transaction.getRentalCost());
        assertFalse(vehicle.isAvailableForRental());

        // Attempt to rent an unavailable vehicle
        RentalTransaction transaction2 = agency.rentVehicle(customer, vehicle, 2);
        assertNull(transaction2);
    }

    @Test
    void returnVehicle() {
        RentalAgency agency = new RentalAgency();
        Vehicle vehicle = new Car("C004", "Ford", 70.0, "Black", true, false);
        agency.addVehicle(vehicle);

        // Rent and then return the vehicle
        Customer customer = new Customer("67890", "Jane Doe", "0247562348");
        agency.rentVehicle(customer, vehicle, 5);
        agency.returnVehicle(vehicle);

        assertTrue(vehicle.isAvailableForRental());
    }
}