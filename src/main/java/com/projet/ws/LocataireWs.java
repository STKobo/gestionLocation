package com.projet.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.projet.pojo.Locataire;
import com.projet.service.LocataireService;

@RequestMapping(ApiRegistration.API_REST + ApiRegistration.LOCATAIRE) 
@RestController
public class LocataireWs {
    
    @Autowired
    private LocataireService locataireService;

    @GetMapping
    public List<Locataire> getAllLocataire(){
        return locataireService.getAllLocataire(); 
    }

    @GetMapping("{id}")
    public Locataire getLocataireById(@PathVariable("id") Long id){
        return null;
    }

    @PostMapping
    public void createLocataire(@RequestBody Locataire locataire){

    }

    @PutMapping("{id}")
    public void updateAdherentById(@RequestBody Locataire locataire, @PathVariable Long id){

    }

    @DeleteMapping("{id}")
    public void deleteLocataireById(@PathVariable Long id){

    }
}
