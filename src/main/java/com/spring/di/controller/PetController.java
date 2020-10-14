package com.spring.di.controller;

import com.spring.di.services.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(@Qualifier("PetService") PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
