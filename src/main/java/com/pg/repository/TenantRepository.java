package com.pg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pg.pojos.Tenant;
import com.pg.pojos.Login;

public interface TenantRepository extends JpaRepository<Tenant , Integer> {
	
	

}
