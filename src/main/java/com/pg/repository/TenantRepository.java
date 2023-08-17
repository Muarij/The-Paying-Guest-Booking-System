package com.pg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import com.pg.pojos.Tenant;

public interface TenantRepository extends JpaRepository<Tenant, Integer> {
	
	@Query("SELECT t FROM Tenant t WHERE t.id = ?1")
    Tenant getById(Long id);
	

}
