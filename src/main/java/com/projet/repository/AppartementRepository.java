package com.projet.repository;

import org.springframework.data.repository.CrudRepository;

import com.projet.pojo.Appartement;

public interface AppartementRepository extends CrudRepository<Appartement, Long>{
    
}
