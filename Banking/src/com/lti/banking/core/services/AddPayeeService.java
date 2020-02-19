package com.lti.banking.core.services;

import java.util.ArrayList;

import com.lti.banking.core.entities.PayeeDetail;
import com.lti.banking.core.exceptions.PayeeException;

public interface AddPayeeService {

	public ArrayList<PayeeDetail> getPayeeList() throws PayeeException;
	public boolean createNewPayee(PayeeDetail addpayee) throws PayeeException;
}
