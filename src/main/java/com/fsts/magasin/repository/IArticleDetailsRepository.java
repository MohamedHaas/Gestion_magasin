package com.fsts.magasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsts.magasin.entities.ArticleDetailsEntite;

public interface IArticleDetailsRepository extends JpaRepository<ArticleDetailsEntite, Long> {

}
