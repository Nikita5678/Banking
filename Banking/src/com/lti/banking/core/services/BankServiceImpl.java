package com.lti.banking.core.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.banking.core.daos.BankDaoImpl;
import com.lti.banking.core.entities.Register;
import com.lti.banking.core.exceptions.HrException;

@Service
public class BankServiceImpl implements BankService {

	BankDaoImpl dao = new BankDaoImpl();

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Override
	public boolean createNewUser(Register reg) throws HrException {

		return dao.insertNewUser(reg);
	}
}
