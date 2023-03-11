package com.pevir.gestiondestock.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeFournisseurDto {

	private ArticleDto article;

	private CommandeFournisseurDto commandeFournisseur;

	private BigDecimal quantite;

	private BigDecimal prixUnitaire;
}
