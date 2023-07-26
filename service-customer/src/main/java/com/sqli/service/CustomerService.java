package com.sqli.service;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqli.dao.CustomerBD;
import com.sqli.dao.oe.Customer;
import com.sqli.shared.BdScript;

import java.util.List;

@Service
public class CustomerService {

	@Autowired
	private CustomerBD customerBD;
	
   
    public void purgeCustomersWithNullStatus() {
        List<Customer> customers = customerBD.dbCustomer();
        BdScript bdScript=new BdScript();
        for (Customer customer : customers) {
            if (StringUtils.isBlank(customer.getStatus()) 
            		|| StringUtils.isEmpty(customer.getStatus()) 
            		|| customer.getStatus() == null ) {
            	bdScript.getCustomerBDs().remove(customer);
            }
        }
    }
}