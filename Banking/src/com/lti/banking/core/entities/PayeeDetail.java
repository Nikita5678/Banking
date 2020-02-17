package com.lti.banking.core.entities;

public class PayeeDetail {

	private long pNo;
	private String pName;
	private long pAccountNo;
	private String bankName;
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
