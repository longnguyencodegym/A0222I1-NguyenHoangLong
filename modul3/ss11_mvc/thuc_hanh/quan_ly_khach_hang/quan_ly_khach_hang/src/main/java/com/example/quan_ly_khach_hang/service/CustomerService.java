package com.example.quan_ly_khach_hang.service;

import com.example.quan_ly_khach_hang.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}