package com.pevir.gestiondestock.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeClientDto {

	private ArticleDto article;

	private CommandeClientDto commandeClient;

	private BigDecimal quantite;

	private BigDecimal prixUnitaire;
}
