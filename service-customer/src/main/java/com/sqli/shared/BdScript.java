package com.sqli.shared;

import java.util.List;

import com.sqli.dao.CustomerBD;
import com.sqli.dao.oe.Customer;

public class BdScript {
	private List<CustomerBD> customerBDs;

	public List<CustomerBD> getCustomerBDs() {
		return customerBDs;
	}

	public void setCustomerBDs(List<CustomerBD> customerBDs) {
		this.customerBDs = customerBDs;
	}
	
	
}
