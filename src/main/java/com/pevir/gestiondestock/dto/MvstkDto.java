package com.pevir.gestiondestock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.pevir.gestiondestock.model.TypeMvstk;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MvstkDto {

	private Instant dateMvt;

	private String nom;

	private ArticleDto article;

	private BigDecimal quantite;

	private TypeMvstk typeMvstk;
}
