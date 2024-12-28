package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    @Test
    void calculateRentalCost() {
        Truck truck1 = new Truck("T001", "Ford", 100.0, true, 120.0, "Pickup");
        Truck truck2 = new Truck("T002", "Isuzu", 150.0, true, 100.0, "Box Truck");

        // Test rental cost for Pickup truck
        double pickupCost = truck1.calculateRentalCost(3);
        assertEquals(320.0, pickupCost, "Pickup truck rental cost should include a $20 surcharge.");

        // Test rental cost for Box truck
        double boxTruckCost = truck2.calculateRentalCost(3);
        assertEquals(450.0, boxTruckCost, "Box truck rental cost should not include a surcharge.");

    }

    @Test
    void isAvailableForRental() {
        Truck availableTruck = new Truck("T001", "Ford", 100.0, true, 120.0, "Pickup");
        Truck unavailableTruck = new Truck("T002", "Isuzu", 150.0, false, 100.0, "Box Truck");

        assertTrue(availableTruck.isAvailableForRental(), "Truck should be available for rental.");
        assertFalse(unavailableTruck.isAvailableForRental(), "Truck should not be available for rental.");

    }

    @Test
    void getTruckType() {
        Truck truck = new Truck("T001", "Ford", 100.0, true, 120.0, "Pickup");
        assertEquals("Pickup", truck.getTruckType(), "Truck type should be 'Pickup'.");

    }

    @Test
    void setTruckType() {
        Truck truck = new Truck("T001", "Ford", 100.0, true, 120.0, "Pickup");
        truck.setTruckType("Box Truck");
        assertEquals("Box Truck", truck.getTruckType(), "Truck type should be updated to 'Box Truck'.");
    }

    @Test
    void getSpeedCapacity() {
        Truck truck = new Truck("T001", "Ford", 100.0, true, 120.0, "Pickup");
        assertEquals(120.0, truck.getSpeedCapacity(), "Speed capacity should be 120.0.");

    }

    @Test
    void setSpeedCapacity() {
        Truck truck = new Truck("T001", "Ford", 100.0, true, 120.0, "Pickup");
        truck.setSpeedCapacity(130.0);
        assertEquals(130.0, truck.getSpeedCapacity(), "Speed capacity should be updated to 130.0.");
    }
}