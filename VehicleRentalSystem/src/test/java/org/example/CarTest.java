package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void calculateRentalCost() {
        // Create object
        Car car = new Car("001", "Camry", 100, "White", true, true); // Assuming a constructor exists
        int rentalDays = 5;

        // Act
        double rentalCost = car.calculateRentalCost(rentalDays);

        // Assert
        assertEquals(520, rentalCost, "Rental cost should be calculated as daily rate * number of days");

    }

    @Test
    void isAvailableForRental() {
        Car car = new Car("001", "Camry", 100, "White", true, true);

        car.setAvailable(true);
        assertTrue(car.isAvailableForRental(), "Car should be available for rental");

        car.setAvailable(false);
        assertFalse(car.isAvailableForRental(), "Car should not be available for rental");

    }

    @Test
    void testToString() {
        Car car = new Car("001", "Camry", 100, "White", true, true);

        String carString = car.toString();

        assertEquals("Vehicle ID is 001and Model is Camry", carString,
                "toString should return the correct string representation of the Car");

    }

    @Test
    void getColor() {
        Car car = new Car("001", "Camry",  100,"White",true, true);

        String color = car.getColor();

        assertEquals("White", color, "getColor should return the correct color");

    }

    @Test
    void setColor() {
        Car car = new Car("001", "Camry", 100,"White", true, true);

        car.setColor("Blue");

        assertEquals("Blue", car.getColor(), "setColor should update the car's color");

    }

    @Test
    void testEquals() {
        Car car1 = new Car("C001", "Toyota Corolla", 100.0, "Blue", true, true);
        Car car2 = new Car("C002", "Toyota Corolla", 100.0, "Blue", true, true);
        Car car3 = new Car("C003", "Honda Civic", 120.0, "Red", false, true);

        assertEquals(car1, car2, "Cars with the same color and AC status should be equal");
        assertNotEquals(car1, car3, "Cars with different attributes should not be equal");

    }

    @Test
    void testHashCode() {
        Car car1 = new Car("C001", "Toyota Corolla", 100.0, "Blue", true, true);
        Car car2 = new Car("C002", "Toyota Corolla", 100.0, "Blue", true, true);

        assertEquals(car1.hashCode(), car2.hashCode(),
                "Cars with the same color and AC status should have the same hash code");

    }

    @Test
    void isHasAC() {
        Car carWithAC = new Car("C001", "Toyota Corolla", 100.0, "Blue", true, true);
        Car carWithoutAC = new Car("C002", "Honda Civic", 120.0, "Red", false, true);

        assertTrue(carWithAC.isHasAC(), "Car with AC should return true for isHasAC");
        assertFalse(carWithoutAC.isHasAC(), "Car without AC should return false for isHasAC");

    }
}