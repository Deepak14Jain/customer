package com.deepak.customer.Service;

import com.deepak.customer.Model.Customer;
import com.deepak.customer.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomersSvc() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerByIdSvc(int customerId) {
        return customerRepository.findById(customerId).get();
    }

    @Override
    public Customer createNewCustomerSvc(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomerSvc(Customer customer) {
        Customer updatedCustomer = getCustomerByIdSvc(customer.getId());
        updatedCustomer.setCustomerName(customer.getCustomerName());
        updatedCustomer.setAddr(customer.getAddr());
        updatedCustomer.setPhone(customer.getPhone());
        updatedCustomer.setEmail(customer.getEmail());
        customerRepository.save(updatedCustomer);
        return updatedCustomer;
    }

    @Override
    public void deleteCustomerByIdSvc(int customerId) {
        customerRepository.deleteById(customerId);
    }
}
