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
@Table(name = "LOTS")
@Data @NoArgsConstructor @AllArgsConstructor
public class LotsEntite {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;
    
    @Column(name = "STATUS")
    private String status;
    
    @Column(name = "STATUS_LIVRAISON")
    private String statusLivraison;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FOURNISSEUR")
    private FournisseurEntite fournisseur;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MARCHE")
    private MarcheEntite marche;

}
