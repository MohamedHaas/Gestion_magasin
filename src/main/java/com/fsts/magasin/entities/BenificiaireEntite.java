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
@Table(name = "BENIFICAIRE")
@Data @NoArgsConstructor @AllArgsConstructor
public class BenificiaireEntite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;

    @Column(name = "DATE_CREATION" , nullable = false)
    private Date creationDate;

    @Column(name = "DATE_DERNIERE_MODIFICATION")
    private Date lastModifiDate;

    @Column(name = "NOM_BENIFCIAIRE" , nullable = false)
    private String nom;

    @Column(name = "PRENOM_BENIFCIAIRE", nullable = false)
    private String prenom;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "NUMERO_TELEPHONE")
    private String numTel;

    @Column(name = "PROFILE")
    private String Profile;

}
