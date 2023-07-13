package com.SpringCrud.SpringApplication.Service;

import com.SpringCrud.SpringApplication.CustomerRepo.CustomerRepo;
import com.SpringCrud.SpringApplication.DTO.CustomerDTO;
import com.SpringCrud.SpringApplication.DTO.CustomerSaveDTO;
import com.SpringCrud.SpringApplication.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceIMPL implements CustomerService{
@Autowired
private CustomerRepo CustomerRepo;
    @Override
    public String addcustomer(CustomerSaveDTO customerSaveDTO) {
        Customer customer=new Customer(
                customerSaveDTO.getCustomername(),
                customerSaveDTO.getCustomeraddress(),
                customerSaveDTO.getMobile()

        );

        CustomerRepo.save(customer);
        return customer.getCustomername();
    }
}
