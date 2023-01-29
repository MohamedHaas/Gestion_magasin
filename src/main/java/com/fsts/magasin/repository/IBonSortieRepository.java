package com.fsts.magasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsts.magasin.entities.BonSortieEntite;

public interface IBonSortieRepository extends JpaRepository<BonSortieEntite, Long> {

}
