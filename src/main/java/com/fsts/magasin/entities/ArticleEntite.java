package com.fsts.magasin.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ARTICLE")
@Data @NoArgsConstructor @AllArgsConstructor
public class ArticleEntite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;

    @Column(name = "DESIGNTAION")
    private String designation;

    @Column(name = "QUANTITE")
    private Long quantity;

    @Column(name = "ISCONSOMABLE")
    private boolean isConsomable;

    @Column(name = "ISINVENTAIRE")
    private Long isInventaire;

    @Column(name = "UNITE")
    private Long unite;

    @Column(name = "STATUS")
    private Long status;

    @Column(name = "TYPEENTREE")
    private Long typeEntree;
    
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ARTICLE")
    private List<BonCommandeArticle> bonCommandeArticle;
    
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ARTICLE") 
    private List<ArticleDetailsEntite> article;
}
