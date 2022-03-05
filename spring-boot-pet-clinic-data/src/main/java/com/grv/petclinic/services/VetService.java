package com.grv.petclinic.services;

import java.util.Set;

import com.grv.petclinic.model.Vet;

public interface VetService {
	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();
}
