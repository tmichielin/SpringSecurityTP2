package com.inti.model;


import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Chambre {

    public Chambre() {
    }

    private int id;
    private int numero;
    private int superficie;
    private int etage;
    private boolean dispo;
    private double prix;

}