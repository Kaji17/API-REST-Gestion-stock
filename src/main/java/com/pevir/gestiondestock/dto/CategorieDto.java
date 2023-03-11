package com.pevir.gestiondestock.dto;

import java.util.List;

import com.pevir.gestiondestock.model.Categorie;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategorieDto {

	private String code;

	private String designation;

	private List<ArticleDto> articles;


}
