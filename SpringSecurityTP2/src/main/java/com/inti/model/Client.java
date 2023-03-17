package com.inti.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Client {

    public Client() {
    }

    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String tel;

}