package com.pg.pojos;

import java.time.LocalDate;

public class RegisterTenant {
	
private String firstName;
	
	private String lastName;
	
	private String contactNumber;

	private String emailId;
	private LocalDate registrationDate;
	public RegisterTenant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisterTenant(String firstName, String lastName, String contactNumber, String emailId,
			LocalDate registrationDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.registrationDate = registrationDate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	

}
