package com.lti.banking.tests;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.junit.Test;

import com.lti.banking.core.entities.Register;
import com.lti.banking.web.controllers.RegisterController;

public class RegisterBankTest {

	@Test
	public void addUser() {
		RegisterController regc = new RegisterController();
		Register reg = new Register();

		reg.setAadharNo(854631141);
		reg.setAddress("Mumbai");
		reg.setApplicationStatus("Accepted");
		reg.setdOB(LocalDateTime.now());
		reg.setEmail("saurabh@123");
		reg.setName("Saurabh");
		reg.setNominee("Shreya");
		reg.setPan("addf45645");
		reg.setPhoneNo(846564185);

		regc.register(reg);
	}

}
