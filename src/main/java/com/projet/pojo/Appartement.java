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
public class Appartement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 

    private String adresse; 

    private String taille; 

    private String nbChambre;

    private String prix; 

    private Boolean etat; 


    public Appartement(Long id, String adresse, String taille, String nbChambre, String prix, Boolean etat) {
        this.id = id;
        this.adresse = adresse;
        this.taille = taille;
        this.nbChambre = nbChambre;
        this.prix = prix;
        this.etat = etat;
    }


    public Appartement() {
    }


}
