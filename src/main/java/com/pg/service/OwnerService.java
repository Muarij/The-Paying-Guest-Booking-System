package com.pg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pg.pojos.Owner;
import com.pg.repository.OwnerRepository;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepo;

    public Owner save(Owner owner) {
        return ownerRepo.save(owner);
    }

    public List<Owner> getAll() {
        return ownerRepo.findAll();
    }

    public Optional<Owner> getById(Integer id) {
        return ownerRepo.findById(id);
    }

    public Owner update(Integer id, Owner updatedOwner) {
        Optional<Owner> optionalOwner = getById(id);
        
        if (optionalOwner.isPresent()) {
            Owner existingOwner = optionalOwner.get();
            existingOwner.setFirstName(updatedOwner.getFirstName());
            existingOwner.setLastName(updatedOwner.getLastName());
            existingOwner.setContactNumber(updatedOwner.getContactNumber());
            existingOwner.setEmailId(updatedOwner.getEmailId());
            // Update other properties as needed
            return ownerRepo.save(existingOwner);
        } else {
            throw new IllegalArgumentException("Owner not found with id: " + id);
        }
    }

    public void delete(Integer id) {
        Optional<Owner> optionalOwner = getById(id);
        
        if (optionalOwner.isPresent()) {
            ownerRepo.delete(optionalOwner.get());
        } else {
            throw new IllegalArgumentException("Owner not found with id: " + id);
        }
    }
}
