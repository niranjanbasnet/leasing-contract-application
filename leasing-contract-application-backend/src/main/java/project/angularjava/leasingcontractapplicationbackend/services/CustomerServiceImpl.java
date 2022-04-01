package project.angularjava.leasingcontractapplicationbackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.angularjava.leasingcontractapplicationbackend.entities.Customer;
import project.angularjava.leasingcontractapplicationbackend.repositories.CustomerRepository;
import project.angularjava.leasingcontractapplicationbackend.repositories.LeasingContractRepository;
import project.angularjava.leasingcontractapplicationbackend.repositories.VehicleRepository;
import java.io.IOException;

@Service
public class CustomerServiceImpl implements CustomerService{

    /*private final CustomerRepository customerRepository;
    private final LeasingContractRepository leasingContractRepository;
    private final VehicleRepository vehicleRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository, LeasingContractRepository leasingContractRepository, VehicleRepository vehicleRepository) {
        this.customerRepository = customerRepository;
        this.leasingContractRepository = leasingContractRepository;
        this.vehicleRepository = vehicleRepository;
    }*/

    @Override
    public void createCustomer(Customer customer) {
        System.out.println("Inside service "+ customer.getFirstname());
    }

}
