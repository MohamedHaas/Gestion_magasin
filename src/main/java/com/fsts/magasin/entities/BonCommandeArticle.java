package com.fsts.magasin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BON_COMMANDE_ARTICLE")
@Data @NoArgsConstructor @AllArgsConstructor
public class BonCommandeArticle {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;
	
	@Column(name = "QUANTITE_COMMANDE")
	private Long quantiteCommande;
	
	@Column(name = "QUANTITE_LIVRE")
	private Long quantiteLivre;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_BON_COMMANDE")
	private BonCommandeEntite bonCommande;

}
