package com.deepak.customer.Service;

import com.deepak.customer.Model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICustomerService {
    public List<Customer> getAllCustomersSvc();
    public Customer getCustomerByIdSvc(int customerId);
    public Customer createNewCustomerSvc(Customer customer);
    public Customer updateCustomerSvc(Customer customer);
    public void deleteCustomerByIdSvc(int customerId);
}
