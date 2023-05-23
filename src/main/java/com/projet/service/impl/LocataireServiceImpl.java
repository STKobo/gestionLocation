package com.projet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.pojo.Locataire;
import com.projet.repository.LocataireRepository;
import com.projet.service.LocataireService;

@Service
public class LocataireServiceImpl implements LocataireService{
    
    @Autowired
    private LocataireRepository locataireRepository;

    @Override
    public List<Locataire> getAllLocataire() {
        return locataireRepository.findAllLocataire(); 
    }
}
