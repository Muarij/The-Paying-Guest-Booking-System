package com.pg.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pg.pojos.RegisterTenant;
import com.pg.pojos.Tenant;
import com.pg.service.TenantService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/tenant")
public class TenantController {

    @Autowired
    private TenantService tenantService;

    @PostMapping("/register")
    public Tenant registerTenant(@RequestBody Tenant tenant) {
        //Tenant tenant = new Tenant(rtenant.getFirstName(), rtenant.getLastName(), rtenant.getContactNumber(), rtenant.getEmailId(), rtenant.getRegistrationDate(), );
        return tenantService.save(tenant);
    }

    @GetMapping("/getAll")
    public List<Tenant> getAllTenants() {
        return tenantService.getAll();
    }
    
    @PutMapping("/update/{id}")
    public Tenant updateTenant(@RequestBody Tenant tenant, @PathVariable Long id) {
        return tenantService.update(id, tenant);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTenant(@PathVariable Long id) {
        tenantService.delete(id);
    }
    
    
}
