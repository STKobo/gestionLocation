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
public class Utilisateur {
    
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id; 

  private String nom;

  private String prenom; 

  private String emal; 

  private String telephone; 

  private String password; 

  private String role; 


    public Utilisateur(Long id, String nom, String prenom, String emal, String telephone, String password, String role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.emal = emal;
        this.telephone = telephone;
        this.password = password;
        this.role = role;
    }


    public Utilisateur() {
    }



}
