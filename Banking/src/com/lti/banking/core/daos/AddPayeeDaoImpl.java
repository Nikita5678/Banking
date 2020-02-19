package com.lti.banking.core.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.lti.banking.core.entities.PayeeDetail;
import com.lti.banking.core.exceptions.HrException;
import com.lti.banking.core.exceptions.PayeeException;

@Repository("addPayee")
@Scope("singleton")
public class AddPayeeDaoImpl implements AddPayeeDao {

	@PersistenceContext
    private EntityManager manager;
	
	@Override
	public ArrayList<PayeeDetail> getPayeeList() throws PayeeException {
		String strQry ="from AddPayee";
		Query qry= manager.createQuery(strQry);
		List<PayeeDetail> list=qry.getResultList();
		return (ArrayList<PayeeDetail>) list;
	
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public boolean insertNewPayee(PayeeDetail addpayee) throws PayeeException {
		manager.persist(addpayee);
		return true;
	}
}
