package com.pg.pojos;

import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Data
@Getter
@Setter
@NoArgsConstructor



public class RegisterTenant {
	
private String firstName;
	
	private String lastName;
	
	private String contactNumber;

	private String emailId;
	private LocalDate registrationDate;
	
	public RegisterTenant(String firstName, String lastName, String contactNumber, String emailId,
			LocalDate registrationDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.registrationDate = registrationDate;
	}
	
	

}
