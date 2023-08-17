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

import com.pg.pojos.Owner;
import com.pg.service.OwnerService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @PostMapping("/register")
    public Owner registerOwner(@RequestBody Owner owner) {
        return ownerService.save(owner);
    }

    @GetMapping("/getAll")
    public List<Owner> getAllOwners() {
        return ownerService.getAll();
    }
    
    @PutMapping("/update/{id}")
    public Owner updateOwner(@RequestBody Owner owner, @PathVariable Integer id) {
        return ownerService.update(id, owner);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOwner(@PathVariable Integer id) {
        ownerService.delete(id);
    }
    
	/*
	 * @GetMapping("/getAllTenants") public List<Tenants> getAllTenants() { return
	 * ownerService.getAllTenants(); }
	 */
    
    
}
