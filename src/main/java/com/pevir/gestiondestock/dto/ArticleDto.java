package com.pevir.gestiondestock.dto;

import java.math.BigDecimal;

import com.pevir.gestiondestock.model.Categorie;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ArticleDto {
	
	private String codeArticle;
	
	private String designation;
	
	private BigDecimal prixUnitaire;
	
	private BigDecimal tauxtva;
	
	private BigDecimal prixUnitaireTtc;
	
	private String photo;
	
	private CategorieDto categorie;
	
	
}
