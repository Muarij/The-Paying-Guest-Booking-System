package com.pg.service;

import java.util.List;

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
		
}
