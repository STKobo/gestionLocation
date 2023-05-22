package com.projet.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AgenceUtil {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 

    @OneToOne
    @JoinColumn(name = "id")
    private Agence agence; 

    @OneToOne
    @JoinColumn(name= "id")
    private Utilisateur utilisateur; 


    public AgenceUtil(Long id, Agence agence, Utilisateur utilisateur) {
        this.id = id;
        this.agence = agence;
        this.utilisateur = utilisateur;
    }


    public AgenceUtil() {
    }


}
