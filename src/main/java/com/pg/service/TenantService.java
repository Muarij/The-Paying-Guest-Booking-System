package com.pg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pg.pojos.RegisterTenant;
import com.pg.pojos.Tenant;
import com.pg.repository.TenantRepository;

@Service
public class TenantService {
	@Autowired
	TenantRepository tenantrepo;
	
	public Tenant save(Tenant tenant) {
		return tenantrepo.save(tenant);
    }
	
	public List<Tenant> getAll()
	{
		
		return tenantrepo.findAll();
	}
	
	public Optional<Tenant> getById(Long id) {
	    return Optional.ofNullable(tenantrepo.getById(id));
	}
	
	public Tenant update(Long id, Tenant updatedTenant) {
        Optional<Tenant> optionalTenant = getById(id);
        
        if (optionalTenant.isPresent()) {
            Tenant existingTenant = optionalTenant.get();
            existingTenant.setFirstName(updatedTenant.getFirstName());
            existingTenant.setLastName(updatedTenant.getLastName());
            existingTenant.setContactNumber(updatedTenant.getContactNumber());
            existingTenant.setEmailId(updatedTenant.getEmailId());
            // Update other properties as needed
            return tenantrepo.save(existingTenant);
        } else {
            throw new IllegalArgumentException("Tenant not found with id: " + id);
        }
    }

    public void delete(Long id) {
        Optional<Tenant> optionalTenant = getById(id);
        
        if (optionalTenant.isPresent()) {
            tenantrepo.delete(optionalTenant.get());
        } else {
            throw new IllegalArgumentException("Tenant not found with id: " + id);
        }
    }
		
}
