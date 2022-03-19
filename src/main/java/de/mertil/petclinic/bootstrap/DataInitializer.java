package de.mertil.petclinic.bootstrap;

import de.mertil.petclinic.models.Owner;
import de.mertil.petclinic.models.Vet;
import de.mertil.petclinic.services.OwnerService;
import de.mertil.petclinic.services.VetService;
import de.mertil.petclinic.services.map.OwnerServiceMap;
import de.mertil.petclinic.services.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataInitializer(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstname("James");
        owner1.setLastname("Smith");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstname("Martin");
        owner2.setLastname("Brown");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstname("Rick");
        vet1.setLastname("Johnas");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstname("Selena");
        vet2.setLastname("Wick");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
