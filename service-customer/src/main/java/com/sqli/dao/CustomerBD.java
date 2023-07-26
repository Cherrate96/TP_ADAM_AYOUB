package com.sqli.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sqli.dao.oe.Customer;

@Component
public class CustomerBD {
	public  List<Customer> dbCustomer() {
		return List.of(
				new Customer(338509634, "First Customer", "M", new Date(), "9959959955", "customeremail@gmail.com",
						"Active"),
				new Customer(338509635, "Second Customer", "F", new Date(), "9988877777", "secondcustomer@example.com",
						"Active"),
				new Customer(338509636, "Third Customer", "M", new Date(), "9876543210", "thirdcustomer@example.com",
						"Active"));
	}
}
