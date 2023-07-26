package com.sqli.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sqli.dao.CustomerBD;
import com.sqli.dao.oe.Customer;

@RestController
public class CustomerController {

	@Autowired
	private CustomerBD customerBD;

	@GetMapping
	  public  Customer getCustomerById(int id) {
        return customerBD.dbCustomer().stream()
                .filter(customer -> customer.getAccount_no()==id)
                .findFirst()
                .orElse(null);
    }

	 @PostMapping
	    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
	        return new ResponseEntity<>(customer, HttpStatus.CREATED);
	    }

 

}
