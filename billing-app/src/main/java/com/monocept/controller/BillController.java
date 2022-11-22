package com.monocept.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class BillController {
	
	@GetMapping("/users")
	public ResponseEntity<?> getUsers(){
		
	}
	
	

}
