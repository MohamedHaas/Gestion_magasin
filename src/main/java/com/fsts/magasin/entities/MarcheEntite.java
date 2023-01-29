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
@Table(name = "Marche")
@Data @NoArgsConstructor @AllArgsConstructor
public class MarcheEntite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;

    @Column(name = "DATE_EDITION")
    private Date dateEdition;

    @Column(name = "DATE_CREATION")
    private Date dateCreation;

    @Column(name = "DATE_OUVERTURE_STATUS")
    private Date dateOuvertureStatus;

    @Column(name = "STATUS")
    private Integer status;


}
