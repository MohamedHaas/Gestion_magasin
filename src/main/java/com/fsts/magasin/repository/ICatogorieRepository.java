package com.fsts.magasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsts.magasin.entities.CategorieEntite;

public interface ICatogorieRepository extends JpaRepository<CategorieEntite, Long>{

}
