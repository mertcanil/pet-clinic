package de.mertil.petclinic.services;

import de.mertil.petclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastname(String lastname);
}
