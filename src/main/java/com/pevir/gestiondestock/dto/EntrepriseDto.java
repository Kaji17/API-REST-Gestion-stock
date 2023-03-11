package com.pevir.gestiondestock.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EntrepriseDto {

	private String nom;

	private String description;

	private AdresseDto adresse;
	
	private String codeFiscale;

	private String numTel;

	private String email;

	private String photo;

	private String siteWeb;

	private List<UtilisateurDto> utilisateurs;
}
