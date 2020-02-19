package com.lti.banking.core.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.banking.core.daos.AddPayeeDao;
import com.lti.banking.core.entities.PayeeDetail;
import com.lti.banking.core.exceptions.HrException;
import com.lti.banking.core.exceptions.PayeeException;

@Service
public class AddPayeeServiceImpl implements AddPayeeService {

	@Autowired
	private AddPayeeDao dao;

	@Override
	public ArrayList<PayeeDetail> getPayeeList() throws PayeeException {

		return dao.getPayeeList();

	}

	@Override
	public boolean createNewPayee(PayeeDetail addpayee) throws PayeeException {

		return dao.insertNewPayee(addpayee);
	}

}
