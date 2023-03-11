package com.pevir.gestiondestock.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
public class Article extends AbstractEntity {
	
	@Column(name = "codearticle")
	private String codeArticle;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "prixunitaire")
	private BigDecimal prixUnitaire;
	
	@Column(name = "tauxtva")
	private BigDecimal tauxtva;
	
	@Column(name = "prixunitairettc")
	private BigDecimal prixUnitaireTtc;
	
	@Column(name = "photo")
	private String photo;
	
	@ManyToOne
	@JoinColumn(name = "idcategorie")
	private Categorie categorie;

}
