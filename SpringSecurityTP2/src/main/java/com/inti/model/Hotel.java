package com.inti.model;


import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Hotel {

    public Hotel() {
    }

    private int id;
    private String tel;
    private String adresse;

}