package com.pg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pg.pojos.Tenant;
import com.pg.repository.TenantRepository;

@Service
public class TenantService {
	@Autowired
	TenantRepository tenantrepo;
	
	public Tenant save(Tenant obj)
	{
		return tenantrepo.save(obj);
	}
	
	public List<Tenant> getAll()
	{
		
		return tenantrepo.findAll();
	}
		
}
