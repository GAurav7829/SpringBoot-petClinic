package com.grv.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.grv.petclinic.model.Owner;
import com.grv.petclinic.model.Vet;
import com.grv.petclinic.services.OwnerService;
import com.grv.petclinic.services.VetService;
import com.grv.petclinic.services.map.OwnerServiceMap;
import com.grv.petclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader() {
		ownerService = new OwnerServiceMap();
		vetService = new VetServiceMap();
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Gaurav");
		owner1.setLastName("Singh");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Narender");
		owner2.setLastName("Singh");
		
		ownerService.save(owner2);
		
		System.out.println("Owner Loaded...");
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Raushan");
		vet1.setLastName("Singh");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Umesh");
		vet2.setLastName("Sharma");
		
		vetService.save(vet2);
		
		System.out.println("Vet Loaded...");
	}

}
