package com.lti.banking.core.entities;

import java.time.LocalDateTime;

public class TransactionActivity {

	private long transactionNo;
	private String tName;
	private long tAccountNo;
	private String transactionType;
	private LocalDateTime tDate;
	private double tAmmount;
	private String tStatus;
	
	public TransactionActivity() {
		super();
	}

	public TransactionActivity(long transactionNo, String tName, long tAccountNo, String transactionType,
			LocalDateTime tDate, double tAmmount, String tStatus) {
		super();
		this.transactionNo = transactionNo;
		this.tName = tName;
		this.tAccountNo = tAccountNo;
		this.transactionType = transactionType;
		this.tDate = tDate;
		this.tAmmount = tAmmount;
		this.tStatus = tStatus;
	}

	public long getTransactionNo() {
		return transactionNo;
	}

	public void setTransactionNo(long transactionNo) {
		this.transactionNo = transactionNo;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public long gettAccountNo() {
		return tAccountNo;
	}

	public void settAccountNo(long tAccountNo) {
		this.tAccountNo = tAccountNo;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public LocalDateTime gettDate() {
		return tDate;
	}

	public void settDate(LocalDateTime tDate) {
		this.tDate = tDate;
	}

	public double gettAmmount() {
		return tAmmount;
	}

	public void settAmmount(double tAmmount) {
		this.tAmmount = tAmmount;
	}

	public String gettStatus() {
		return tStatus;
	}

	public void settStatus(String tStatus) {
		this.tStatus = tStatus;
	}
	
	
}
