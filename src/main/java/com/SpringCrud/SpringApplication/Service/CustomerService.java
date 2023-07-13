package com.SpringCrud.SpringApplication.Service;
import com.SpringCrud.SpringApplication.DTO.CustomerDTO;
import com.SpringCrud.SpringApplication.DTO.CustomerSaveDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CustomerService  {


    String addcustomer(CustomerSaveDTO customerSaveDTO);
}
