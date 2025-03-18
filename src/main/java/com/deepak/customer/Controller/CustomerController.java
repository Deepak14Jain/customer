package com.deepak.customer.Controller;

import com.deepak.customer.Model.Customer;
import com.deepak.customer.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/getAllCustomers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomersSvc();
    }

    @GetMapping("/getCustomerById/{customerId}")
    public Customer getCustomerById(@PathVariable int customerId){
        return customerService.getCustomerByIdSvc(customerId);
    }

    @PostMapping("/createNewCustomer")
    public Customer createNewCustomer(@RequestBody Customer customer){
        return customerService.createNewCustomerSvc(customer);
    }

    @PutMapping("/updateCustomer")
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomerSvc(customer);
    }

    @DeleteMapping("/deleteCustomerById/{customerId}")
    public void deleteCustomerById(@PathVariable int customerId){
        customerService.deleteCustomerByIdSvc(customerId);
    }
}
