package project.angularjava.leasingcontractapplicationbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.angularjava.leasingcontractapplicationbackend.entities.Customer;
import project.angularjava.leasingcontractapplicationbackend.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void createCustomer(Customer customer) {

        System.out.println("Inside service "+ customer.getFirstname());
    }

}
