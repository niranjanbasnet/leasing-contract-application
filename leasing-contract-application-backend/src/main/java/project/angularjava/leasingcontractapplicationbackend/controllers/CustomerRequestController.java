package project.angularjava.leasingcontractapplicationbackend.controllers;

import org.springframework.web.bind.annotation.*;
import project.angularjava.leasingcontractapplicationbackend.entities.Customer;
//import project.angularjava.leasingcontractapplicationbackend.services.CustomerService;

import java.io.IOException;

/*
* Controller to manage and handle customer data.
* */

@RestController
@RequestMapping("/create-customer")
public class CustomerRequestController {
    //public CustomerService customerService;

    //Create customer with customer object
    @PostMapping(consumes = "application/json")
    public String createCustomer(@RequestBody Customer customer) {
        System.out.println("--------> "+ customer.getFirstname());
        /*try {
            customerService.createCustomer(customer);
        } catch (IOException IOEx) {
            IOEx.printStackTrace();
        }*/
        return "Customer Created";


    }
}
