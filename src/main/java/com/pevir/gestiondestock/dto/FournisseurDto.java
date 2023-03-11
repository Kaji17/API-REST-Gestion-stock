package com.pevir.gestiondestock.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FournisseurDto {

	private String nom;

	private String prenom;

	private String numTel;

	private String email;
	
	private AdresseDto adresse;

	private List<CommandeClientDto> commandeFournisseur;
}
