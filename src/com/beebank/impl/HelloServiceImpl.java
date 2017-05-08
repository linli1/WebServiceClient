package com.beebank.impl;

import javax.jws.WebService;

import com.beebank.model.Customer;
@WebService
public class HelloServiceImpl {
	
	public Customer selectMaxAgeStudent(Customer c1, Customer c2) {
		if (c1.getBirthday().getTime() > c2.getBirthday().getTime())
			return c2;
		else
			return c1;
	}

	public Customer selectMaxLongNameStudent(Customer c1, Customer c2) {
		if (c1.getName().length() > c2.getName().length())
			return c1;
		else
			return c2;
	}
}