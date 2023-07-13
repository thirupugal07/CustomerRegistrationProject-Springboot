package com.SpringCrud.SpringApplication.CustomerController;

import com.SpringCrud.SpringApplication.DTO.CustomerDTO;
import com.SpringCrud.SpringApplication.DTO.CustomerSaveDTO;
import com.SpringCrud.SpringApplication.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @PostMapping(path="/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO)
    {
        String id = customerService.addcustomer(customerSaveDTO);
        return id;
    }



}
