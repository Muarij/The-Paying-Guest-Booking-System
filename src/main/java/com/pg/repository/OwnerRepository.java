package com.pg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import com.pg.pojos.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {
    
    // You can add custom queries if needed
    
    // Example custom query:
    // @Query("SELECT o FROM Owner o WHERE o.emailId = ?1")
    // Owner getByEmail(String email);
}
