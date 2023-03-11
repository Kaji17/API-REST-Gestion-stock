package com.pevir.gestiondestock.dto;

import java.time.Instant;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VenteDto {

	private String code;

	private Instant dateVente;
	
	private Instant commentaire;
}
