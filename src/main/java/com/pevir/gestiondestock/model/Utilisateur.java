package com.pevir.gestiondestock.model;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "utilisateurs")
public class Utilisateur extends AbstractEntity{
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "prenom")
	private String prenom;
	
	@Column(name = "numtel")
	private String numTel;
	
	@Column(name = "email")
	private String email;
	
	@Embedded
	private Adresse adresse;
	
	@Column(name = "datenaissance")
	private Instant dateNaissance;
	
	@Column(name = "photo")
	private String photo;
	
	@Column(name = "motdepasse")
	private String motDePasse;
	
	@ManyToOne
	@JoinColumn(name = "identreprise")
	private Entreprise entreprise;
	
	@OneToMany(mappedBy = "utilisateur")
	private List<Role> roles;

}
