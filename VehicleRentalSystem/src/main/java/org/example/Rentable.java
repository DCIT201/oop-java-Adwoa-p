package org.example;
import java.util.Objects;

public interface Rentable {
    void rent(Customer customer, int days);
    void returnVehicle();
}
