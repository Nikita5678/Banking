package com.lti.banking.core.services;

import com.lti.banking.core.entities.Register;
import com.lti.banking.core.exceptions.HrException;

public interface BankService {
	public boolean createNewUser(Register reg) throws HrException;
}
