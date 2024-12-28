package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class CustomerTest {

    @Test
    void getCustomerId() {
        // Create object
        Customer customer = new Customer("C001", "John Doe", "1234567890");

        // Act
        String customerId = customer.getCustomerId();

        // Assert
        assertEquals("C001", customerId, "getCustomerId should return the correct customer ID");

    }

    @Test
    void getCustomerName() {
        Customer customer = new Customer("C001", "John Doe", "1234567890");

        String customerName = customer.getCustomerName();

        assertEquals("John Doe", customerName, "getCustomerName should return the correct customer name");

    }

    @Test
    void getCustomerPhone() {
        Customer customer = new Customer("C001", "John Doe", "1234567890");

        String customerPhone = customer.getCustomerPhone();

        assertEquals("1234567890", customerPhone, "getCustomerPhone should return the correct customer phone number");

    }

    @Test
    void getRentalHistory() {
        Customer customer = new Customer("C001", "John Doe", "1234567890");

        List<RentalTransaction> rentalHistory = customer.getRentalHistory();

        assertNotNull(rentalHistory, "getRentalHistory should not return null");
        assertTrue(rentalHistory.isEmpty(), "Rental history should initially be empty");

    }

    @Test
    void addRentalTransaction() {

        Customer customer = new Customer("C001", "John Doe", "1234567890");
        Car car = new Car("001", "Camry", 100, "White", true, true);
        RentalTransaction transaction = new RentalTransaction(customer, car, 5, 520.0);

        customer.addRentalTransaction(transaction);

        List<RentalTransaction> rentalHistory = customer.getRentalHistory();
        assertEquals(1, rentalHistory.size(), "Rental history should contain one transaction");
        assertEquals(transaction, rentalHistory.get(0), "The transaction added should match the one in rental history");

    }
}