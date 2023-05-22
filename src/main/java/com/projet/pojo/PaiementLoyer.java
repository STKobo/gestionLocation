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
public class PaiementLoyer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long paiementLoyer_id; 

    @OneToOne
    @JoinColumn(name = "contratLoyer_id")
    private ContratLoyer contratLoyer;

    private LocalDate datePaiement; 

    private Float montantPaiement; 
    
}
