package com.deepak.customer.Repository;

import com.deepak.customer.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer, Integer> {
}
