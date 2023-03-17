package com.inti.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;
import lombok.NonNull;

@Entity
@Table
@Data
public class Salarie {

  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;
	@NonNull
	@Column(unique = true, nullable = false)
    private String username;
	@NonNull
	@Column(nullable = false)
    private String mdp;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_role")
    @Exclude
    Role role;

}