package com.spring.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
@Service("PetService")
public class CatPetService implements PetService {

    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}