package com.fsts.magasin.entities;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "ARTICLE_DETAILS")
@Data @NoArgsConstructor @AllArgsConstructor
public class ArticleDetailsEntite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;

    @Column(name = "INVENTAIRE")
    private String inventaire;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STATUS")
    private Long status;

    @Column(name = "DESTINATION")
    private String destination;

}
