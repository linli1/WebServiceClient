package com.beebank.iface;

import javax.jws.WebService;

import com.beebank.model.Customer;

@WebService
public interface IHelloService {
	Customer selectMaxAgeStudent(Customer c1, Customer c2);

	Customer selectMaxLongNameStudent(Customer c1, Customer c2);
}