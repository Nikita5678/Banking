package com.lti.banking.core.entities;

import java.time.LocalDateTime;

public class Register {

	private long applicationNo;
	private String name;
	private String email;
	private String pan;
	private long aadhar;
	private long phone;
	private String address;
	private LocalDateTime dOB;
	private String applicationStatus;
	private String nominee;
	public Register(long applicationNo, String name, String email, String pan, long aadhar, long phone, String address,
			LocalDateTime dOB, String applicationStatus, String nominee) {
		super();
		this.applicationNo = applicationNo;
		this.name = name;
		this.email = email;
		this.pan = pan;
		this.aadhar = aadhar;
		this.phone = phone;
		this.address = address;
		this.dOB = dOB;
		this.applicationStatus = applicationStatus;
		this.nominee = nominee;
	}
	public Register() {
		super();
	}
	public long getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(long applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	public String getNominee() {
		return nominee;
	}
	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	
	
}
