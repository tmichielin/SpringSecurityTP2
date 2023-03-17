package com.inti.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Table
@Data
public class Salarie {

    public Salarie() {
    }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;
    private double prime;
    
    @ManyToOne
    @Exclude
    @JoinColumn(name="idHotel")
    private Hotel hotel;
    
    

}