package com.pevir.gestiondestock.dto;

import java.math.BigDecimal;

import com.pevir.gestiondestock.model.Vente;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneVenteDto {

	private Vente vente;

	private BigDecimal quantite;

	private BigDecimal prixUnitaire;
}
