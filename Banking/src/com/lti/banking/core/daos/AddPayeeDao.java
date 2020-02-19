package com.lti.banking.core.daos;

import java.util.ArrayList;

import com.lti.banking.core.entities.PayeeDetail;
import com.lti.banking.core.exceptions.HrException;
import com.lti.banking.core.exceptions.PayeeException;

public interface AddPayeeDao {

	public ArrayList<PayeeDetail> getPayeeList() throws PayeeException;
	public boolean insertNewPayee (PayeeDetail addpayee) throws PayeeException;
}
