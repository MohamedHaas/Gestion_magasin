package com.fsts.magasin.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORIE")
@Data @NoArgsConstructor @AllArgsConstructor
public class CategorieEntite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;

    @Column(name = "NOM_CATEGORIE", nullable = false)
    private String nom;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany
    @JoinColumn(name = "ID_CATEGORIE")
    private List<ArticleEntite> articles;
}
