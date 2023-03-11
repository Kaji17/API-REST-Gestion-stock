package com.pevir.gestiondestock.dto;

import java.time.Instant;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeFournisseurDto {

	private String code;

	private Instant dateCommande;

	private FournisseurDto fournisseur;

	private List<LigneCommandeClientDto> ligneCommandeFournisseur;
}
