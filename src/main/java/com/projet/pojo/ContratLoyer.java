package com.projet.pojo;

import java.time.LocalDate;

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
public class ContratLoyer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 

    @OneToOne
    @JoinColumn(name = "id")
    private Locataire locataire;

    @OneToOne
    @JoinColumn(name = "id")
    private Appartement appartement;

    private LocalDate dateDebut; 

    private LocalDate dateFin; 

    private Float montantLoyer;

    private Status statut;
    
}
