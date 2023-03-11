package com.pevir.gestiondestock.model;

import java.math.BigDecimal;
import java.time.Instant;

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
@Table(name = "mvtstk")
public class Mvtstk extends AbstractEntity{
	
	@Column(name = "dateMvt")
	private Instant dateMvt;
	
	@Column(name = "nom")
	private String nom;

	@ManyToOne
	@JoinColumn(name = "idarticle")
	private Article article;
	
	@Column(name = "quantite")
	private BigDecimal quantite;
	
	@Column(name = "typemvstk")
	private TypeMvstk typeMvstk;
	
	
	
	
}
