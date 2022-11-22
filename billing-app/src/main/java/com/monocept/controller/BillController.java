package com.monocept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.entity.Customer;
import com.monocept.service.CustomerService;

@RestController
@RequestMapping("/user")
public class BillController {

	@Autowired
	private CustomerService service;

	@GetMapping("/users")
	public ResponseEntity<?> getUsers() {
		try {
			List<Customer> customerList = service.getCustomerList();
			return new ResponseEntity<List<Customer>>(customerList, HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			return new ResponseEntity<Exception>(e, HttpStatus.BAD_REQUEST);
		}

	}

}
