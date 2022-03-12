package org.iu.il.petclinic.services;

import org.iu.il.petclinic.models.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastname(String lastname);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
