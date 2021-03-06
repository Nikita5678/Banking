package com.lti.banking.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.banking.core.entities.PayeeDetail;
import com.lti.banking.core.exceptions.PayeeException;
import com.lti.banking.core.services.AddPayeeService;

@RestController
public class AddPayeeController {

	@Autowired
	private AddPayeeService service;
	
	@PostMapping(value = "/addPayee", consumes = "application/json")
	public void getPayeeList(@RequestBody  PayeeDetail payee) {
		System.out.println(payee);
		
		try {
			service.createNewPayee(payee);
		} catch (PayeeException e) {
			e.printStackTrace();
		}
	}
	
}
