package com.sunglowsys.service;

import com.sunglowsys.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    Customer update(Customer customer,Long id);

    List<Customer> allFind();

    Customer findById(Long id);

    Customer delete(Long id);
}
