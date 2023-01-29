package com.fsts.magasin.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BON_COMMANDE")
@Data @NoArgsConstructor @AllArgsConstructor
public class BonCommandeEntite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;
    
    @Column(name = "DATE_CREATION" , nullable = false)
    private Date creationDate;

    @Column(name = "DATE_DERNIERE_MODIFICATION")
    private Date lastModifiDate;

    @Column(name = "NUMERO")
    private String numero;

    @Column(name = "DATE_EDITION")
    private Date dateEdition;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "STATUS_LIVRAISON")
    private Integer statusLR;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FOURNISSEUR")
    private FournisseurEntite fournisseur;
}
