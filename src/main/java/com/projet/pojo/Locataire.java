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
public class Locataire {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long locataire_id; 

    private String nom;

    private String prenom;

    private String adresse; 

    private String telephone; 

    private String email; 

    private Float montantLoyer; 


    public Locataire(Long id, String nom, String prenom, String adresse, String telephone, String email, Float montantLoyer) {
        this.locataire_id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.montantLoyer = montantLoyer;
    }


    public Locataire() {
    }


}
