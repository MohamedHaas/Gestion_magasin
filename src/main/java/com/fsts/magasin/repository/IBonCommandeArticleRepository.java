package com.fsts.magasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsts.magasin.entities.BonCommandeArticle;

public interface IBonCommandeArticleRepository extends JpaRepository<BonCommandeArticle, Long> {

}
