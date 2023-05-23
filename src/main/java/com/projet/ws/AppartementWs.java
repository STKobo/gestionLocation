package com.projet.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.service.AppartementService;

@RequestMapping(ApiRegistration.API_REST + ApiRegistration.APPARTEMENT) 
@RestController
public class AppartementWs {
    
    @Autowired
    private AppartementService appartementService;

    @GetMapping

    @PutMapping

    @PostMapping

    @DeleteMapping 

}
