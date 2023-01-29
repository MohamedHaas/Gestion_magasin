package com.fsts.magasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsts.magasin.entities.BonCommandeEntite;

public interface IBonCommandeRepository extends JpaRepository<BonCommandeEntite, Long> {

}
