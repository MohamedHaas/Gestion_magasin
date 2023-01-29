package com.fsts.magasin.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FOURNISSEUR")
@Data @NoArgsConstructor @AllArgsConstructor
public class FournisseurEntite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;
    
    @Column(name = "CrationDate" , nullable = false)
    private Date creationDate;

    @Column(name = "LastModifiDate")
    private Date lastModifiDate;

    @Column(name = "NOM_FOURNISSEUR",nullable = false)
    private String nom;

    @Column(name = "PRENOM_FOURNISSEUR")
    private String prenom;

    @Column(name = "EMAIL")
    private String mail;

    @Column(name = "NUMERO_TELEPHONE")
    private String numTel;

    @Column(name = "NOM_ENTREPRISE")
    private String nomEntreprise;

    @Column(name = "CODE_FISCAL")
    private String CodeFiscal;

    @Column(name = "ADRESSE")
    private String adress;

    @Column(name = "VILLE")
    private String ville;

    @Column(name = "DESCRIPTION")
    private String Description;
    
}
