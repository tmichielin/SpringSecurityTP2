package com.inti.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;
import lombok.ToString.Exclude;

@Entity
@Table
@Data
public class Hotel {

    public Hotel() {
    }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String tel;
    private String adresse;
    
    @OneToMany
    @Exclude
    private List<Chambre> listeChambres;
    
    @OneToMany
    @Exclude
    private List<Salarie> listeSalaries;

}