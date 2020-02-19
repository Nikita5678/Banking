package com.lti.banking.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAYEE_DETAILS")
public class PayeeDetail {
	@Id
	@Column(name="PAYEENO")
	private long pNo;
	
	@Column(name="NAME")
	private String pName;
	
	@Column(name="PAYEE_ACC_NO")
	private long pAccountNo;
	
	@Column(name="BANK_NAME")
	private String bankName;
	
	@Column(name="IFSC")
	private String iFSC;
	
	public PayeeDetail() {
		super();
	}
	public PayeeDetail(long pNo, String pName, long pAccountNo, String bankName, String iFSC) {
		super();
		this.pNo = pNo;
		this.pName = pName;
		this.pAccountNo = pAccountNo;
		this.bankName = bankName;
		this.iFSC = iFSC;
	}
	public long getpNo() {
		return pNo;
	}
	public void setpNo(long pNo) {
		this.pNo = pNo;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public long getpAccountNo() {
		return pAccountNo;
	}
	public void setpAccountNo(long pAccountNo) {
		this.pAccountNo = pAccountNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getiFSC() {
		return iFSC;
	}
	public void setiFSC(String iFSC) {
		this.iFSC = iFSC;
	}
	
	
}
