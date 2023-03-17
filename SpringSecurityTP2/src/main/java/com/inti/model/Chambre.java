package com.inti.model;


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
public class Chambre {

    public Chambre() {
    }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private int numero;
    private int superficie;
    private int etage;
    private boolean dispo;
    private double prix;
    
    @ManyToOne
    @Exclude
    @JoinColumn(name="id_hotel")
    private Hotel hotel;
    
    @ManyToOne
    @Exclude
    @JoinColumn(name="id_client")
    private Client client;

}