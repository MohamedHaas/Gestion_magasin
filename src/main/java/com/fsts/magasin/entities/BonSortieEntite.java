package com.fsts.magasin.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BON_SORTIE")
@Data @NoArgsConstructor @AllArgsConstructor
public class BonSortieEntite {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;
    
    @Column(name = "DATE_DEMANDE" , nullable = false)
    private Date dateDemande;

    @Column(name = "DATE_SORTIE")
    private Date dateSortie;

    @Column(name = "BENIFCIAIRE" , nullable = false)
    private String benificiaire;

    @Column(name = "TYPE_BENIFCIAIRE", nullable = false)
    private String typeBenificiaire;
    
    @Column(name = "DESIGNATION_ARTICLE")
    private String designationArticle;
    
    @Column(name = "STATUS", nullable = false)
    private String status;
    
    @ManyToMany(cascade={CascadeType.ALL})
    @JoinTable(name="BON_SORTIE_ARTICLE", joinColumns=@JoinColumn(name="ID_BON_SORTIE")
    ,inverseJoinColumns=@JoinColumn(name="ARTICLE_DETAILS"))
    private List<ArticleDetailsEntite> articleDetails;

}
