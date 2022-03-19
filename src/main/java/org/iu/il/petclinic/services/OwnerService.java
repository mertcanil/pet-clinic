package org.iu.il.petclinic.services;

import org.iu.il.petclinic.models.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastname(String lastname);
}
