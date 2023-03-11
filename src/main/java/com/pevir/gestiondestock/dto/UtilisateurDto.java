package com.pevir.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import com.pevir.gestiondestock.model.Adresse;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UtilisateurDto {

	private String nom;

	private String prenom;

	private String numTel;

	private String email;

	private Adresse adresse;

	private Instant dateNaissance;

	private String photo;

	private String motDePasse;

	private EntrepriseDto entreprise;

	private List<RoleDto> roles;

}
