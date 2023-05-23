package com.projet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projet.pojo.Appartement;

@Repository
public interface AppartementRepository extends CrudRepository<Appartement, Long>{
    
}
