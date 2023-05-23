package com.projet.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.projet.documentState.AppartmentState;
import com.projet.repository.AppartementRepository;
import com.projet.service.AppartementService;

@Service
public class AppartementServiceImpl implements AppartementService{
    
    @Autowired
    private AppartementRepository appartementRepository;

    @Override
    public List<Appartement> getAllAppartementByState(AppartmentState appartmentState) {
        List<Appartement> appartements = new ArrayList<>();

        switch (appartmentState){
            case LOUER -> 
            case NON_LOUER -> 
            case TOUS -> appartements = (List<Appartement>) appartementRepository.findAll();
        }
    }
}
