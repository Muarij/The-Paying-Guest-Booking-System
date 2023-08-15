package com.pg.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name="tenants")
public class Tenant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer tenantId; 
	
	@Column(length=50,nullable = false)
	private String firstName;
	@Column(length=50,nullable=false)
	private String lastName;
	
	private String contactNumber;
	
	
	@Column(length = 70,unique = true,nullable = false)
	private String emailId;
	
	
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(columnDefinition = "DATE")
	private LocalDate registrationDate;
	
	/*
	
	@JsonIgnoreProperties("customer")
	@OneToOne
	@JoinColumn(name="addressId")
	
	private Address address;
	
	@JsonIgnoreProperties("customer")
	@OneToOne
	@JoinColumn(name="loginId")
	private Login login;

	/*@JsonIgnoreProperties("customer")
	@OneToMany(mappedBy ="customer",cascade = CascadeType.ALL )
	
	private List<Order> order=new ArrayList<Order>();
	*/
	public Tenant() {
		super();
	}

	public Tenant(String firstName, String lastName, String contactNumber, String emailId,
			LocalDate registrationDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.registrationDate = registrationDate;
	}

	public Integer getTenantId() {
		return tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
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

	@Override
	public String toString() {
		return "Tenant [tenantId=" + tenantId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", contactNumber=" + contactNumber + ", emailId=" + emailId + ", registrationDate=" + registrationDate
				+ "]";
	}
	
	
	
	

	
	//Customer cust=new Customer(rcust.getFirstName(), rcust.getLastName(), rcust.getPhoneNumber(), rcust.getEmailId(), persistentaddr, persistentlogin);
	
	
	
	
}

