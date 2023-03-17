package com.inti.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString.Exclude;

@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String tel;
 
	@OneToMany
    @Exclude
    private List<Chambre> listeChambres;
	   
    public Client(String nom, String prenom, String adresse, String email, String tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
	}

}