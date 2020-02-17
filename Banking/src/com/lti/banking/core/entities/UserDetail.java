package com.lti.banking.core.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class UserDetail {

	private long accountNo;
	private String name;
	private String password;
	private String pan;
	private long aadhar;
	private String email;
	private long phone;
	private String address;
	private LocalDateTime dOB;
	private String nimonee;
	private double balance;
	
	private ArrayList<TransactionActivity> transactions;
	private ArrayList<PayeeDetail> payees;
	
	public UserDetail() {
		super();
	}

	public UserDetail(long accountNo, String name, String password, String pan, long aadhar, String email, long phone,
			String address, LocalDateTime dOB, String nimonee, double balance,
			ArrayList<TransactionActivity> transactions, ArrayList<PayeeDetail> payees) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.password = password;
		this.pan = pan;
		this.aadhar = aadhar;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.dOB = dOB;
		this.nimonee = nimonee;
		this.balance = balance;
		this.transactions = transactions;
		this.payees = payees;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public long getAadhar() {
		return aadhar;
	}

	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDateTime getdOB() {
		return dOB;
	}

	public void setdOB(LocalDateTime dOB) {
		this.dOB = dOB;
	}

	public String getNimonee() {
		return nimonee;
	}

	public void setNimonee(String nimonee) {
		this.nimonee = nimonee;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public ArrayList<TransactionActivity> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<TransactionActivity> transactions) {
		this.transactions = transactions;
	}

	public ArrayList<PayeeDetail> getPayees() {
		return payees;
	}

	public void setPayees(ArrayList<PayeeDetail> payees) {
		this.payees = payees;
	}
	
	
}
