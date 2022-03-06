package com.grv.petclinic.services;

import com.grv.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	public Owner findByLastName(String lastName);
}
