package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class CheeseShop {
    private List<Customer> customers = new ArrayList<Customer>();

    public List<Customer> customers() {
        return customers;
    }

    public void enter(Customer customer) {
        customers.add(customer);
    }
}
