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
@Table(name = "lignevente")
public class LigneVente extends AbstractEntity{

	@ManyToOne
	@JoinColumn(name = "idvente")
	private Vente vente;
	
	@Column(name = "quantite")
	private BigDecimal quantite;
	
	@Column(name = "prixunitaire")
	private BigDecimal prixUnitaire;
	
	
}
