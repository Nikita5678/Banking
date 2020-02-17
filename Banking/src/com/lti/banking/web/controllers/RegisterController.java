package com.lti.banking.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lti.banking.core.entities.Register;

import com.lti.banking.core.exceptions.HrException;
import com.lti.banking.core.services.BankService;

public class RegisterController {

	@Autowired
	private BankService service;

	@PostMapping(value = "/addUser", consumes = "application/json")
	public void getDeptList(@RequestBody Register reg) {
		System.out.println(reg);
		try {
			service.createNewUser(reg);
		} catch (HrException e) {
			e.printStackTrace();
		}
	}
}
