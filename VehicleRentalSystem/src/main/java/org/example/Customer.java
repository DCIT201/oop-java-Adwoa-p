package org.example;
import java.util.ArrayList;
import java.util.List;

public class Customer{
    private String customerId;
    private String customerName;
    private String customerPhone;
    private List<RentalTransaction> rentalHistory;

    public Customer(String customerId, String customerName, String customerPhone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.rentalHistory = new ArrayList<>();
    }
    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }

    public void addRentalTransaction(RentalTransaction transaction) {
        this.rentalHistory.add(transaction);
    }
}
