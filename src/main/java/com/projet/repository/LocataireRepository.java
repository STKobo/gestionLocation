package com.projet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projet.pojo.Locataire;

@Repository
public interface LocataireRepository extends CrudRepository<Locataire, Long>{
    
    
    @Query("SELECT a FROM Locataire a")
    public List<Locataire> findAllLocataire();
}
