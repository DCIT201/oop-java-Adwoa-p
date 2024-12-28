package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    @Test
    void calculateRentalCost() {
        // Create object
        Motorcycle motorcycle = new Motorcycle("M001", "Yamaha R15", 50.0, true, "Sport", 40.0);

        // Act
        double rentalCost = motorcycle.calculateRentalCost(5);

        // Assert
        assertEquals(250.0, rentalCost, "calculateRentalCost should return the correct rental cost");

    }

    @Test
    void isAvailableForRental() {
        Motorcycle availableMotorcycle = new Motorcycle("M001", "Yamaha R15", 50.0, true, "Sport", 40.0);
        Motorcycle unavailableMotorcycle = new Motorcycle("M002", "Honda CBR", 60.0, false, "Cruiser", 35.0);

        assertTrue(availableMotorcycle.isAvailableForRental(), "Motorcycle should be available for rental");
        assertFalse(unavailableMotorcycle.isAvailableForRental(), "Motorcycle should not be available for rental");

    }

    @Test
    void getMotorcycleType() {
        Motorcycle motorcycle = new Motorcycle("M001", "Yamaha R15", 50.0, true, "Sport", 40.0);

        String motorcycleType = motorcycle.getMotorcycleType();

        assertEquals("Sport", motorcycleType, "getMotorcycleType should return the correct motorcycle type");

    }

    @Test
    void setMotorcycleType() {
        Motorcycle motorcycle = new Motorcycle("M001", "Yamaha R15", 50.0, true, "Sport", 40.0);

        motorcycle.setMotorcycleType("Cruiser");

        assertEquals("Cruiser", motorcycle.getMotorcycleType(), "setMotorcycleType should update the motorcycle type");

    }

    @Test
    void getFuelEfficiency() {
        Motorcycle motorcycle = new Motorcycle("M001", "Yamaha R15", 50.0, true, "Sport", 40.0);

        double fuelEfficiency = motorcycle.getFuelEfficiency();

        assertEquals(40.0, fuelEfficiency, "getFuelEfficiency should return the correct fuel efficiency");

    }

    @Test
    void setFuelEfficiency() {
        Motorcycle motorcycle = new Motorcycle("M001", "Yamaha R15", 50.0, true, "Sport", 40.0);

        motorcycle.setFuelEfficiency(50.0);

        assertEquals(50.0, motorcycle.getFuelEfficiency(), "setFuelEfficiency should update the fuel efficiency");

    }

    @Test
    void testEquals() {
        Motorcycle motorcycle1 = new Motorcycle("M001", "Yamaha R15", 50.0, true, "Sport", 40.0);
        Motorcycle motorcycle2 = new Motorcycle("M002", "Yamaha R15", 50.0, true, "Sport", 40.0);
        Motorcycle motorcycle3 = new Motorcycle("M003", "Honda CBR", 60.0, false, "Cruiser", 35.0);

        assertEquals(motorcycle1, motorcycle2, "Motorcycles with the same type and fuel efficiency should be equal");
        assertNotEquals(motorcycle1, motorcycle3, "Motorcycles with different attributes should not be equal");

    }

    @Test
    void testToString() {
        Motorcycle motorcycle = new Motorcycle("M001", "Yamaha R15", 50.0, true, "Sport", 40.0);

        String toStringOutput = motorcycle.toString();

        assertEquals("Motorcycle{motorcycleType='Sport', fuelEfficiency=40.0}", toStringOutput,
                "toString should return the correct string representation");

    }

    @Test
    void testHashCode() {
        Motorcycle motorcycle1 = new Motorcycle("M001", "Yamaha R15", 50.0, true, "Sport", 40.0);
        Motorcycle motorcycle2 = new Motorcycle("M002", "Yamaha R15", 50.0, true, "Sport", 40.0);

        assertEquals(motorcycle1.hashCode(), motorcycle2.hashCode(),
                "Motorcycles with the same type and fuel efficiency should have the same hash code");

    }
}