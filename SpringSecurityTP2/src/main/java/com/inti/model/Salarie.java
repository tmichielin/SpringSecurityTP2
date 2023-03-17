package com.inti.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Salarie {

    public Salarie() {
    }

    private int id;
    private String type;
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;
    
    

}