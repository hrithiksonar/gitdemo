package com.monocept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.dao.CustomerDao;
import com.monocept.entity.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao custDao;

	public List<Customer> getCustomerList() {
		List<Customer> customers = custDao.findAll();
		return customers;
	}

}
