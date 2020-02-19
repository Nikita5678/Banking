package com.lti.banking.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.banking.core.entities.Register;
import com.lti.banking.core.exceptions.HrException;

@Repository
public class BankDaoImpl implements BankDao{
	@PersistenceContext
	private EntityManager manager;

	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean insertNewUser(Register reg) throws HrException {
		manager.persist(reg);
		return true;
	}
}
