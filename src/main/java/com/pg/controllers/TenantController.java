package com.pg.controllers;

import java.time.LocalDate;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.pg.pojos.RegisterTenant;
import com.pg.pojos.Tenant;
import com.pg.service.TenantService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/tenant")
public class TenantController {
	

	@Autowired
	private TenantService tenantService;
	
	@PostMapping("/register")
	public Tenant registerTenant(@RequestBody Tenant rtenant)
	{
		// String firstName, String lastName, String contactNumber, String emailId,
		// LocalDate registrationDate
		//Tenant tenant=new Tenant(rtenant.getFirstName(), rtenant.getLastName(), rtenant.getContactNumber(),rtenant.getEmailId(), rtenant.getRegistrationDate());
		return tenantService.save(rtenant)  ;
	}
	
	@GetMapping("/getAll")
	public List<Tenant> getAllTenants()
	{
		return tenantService.getAll();
		 
	}

}
