package com.projet.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Agence {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long agence_id;

    private String nom; 

    private String adresse; 

    private String telephone;

    private String email; 


    public Agence(Long id, String nom, String adresse, String telephone, String email) {
        this.agence_id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
    }


    public Agence() {
    }



}
