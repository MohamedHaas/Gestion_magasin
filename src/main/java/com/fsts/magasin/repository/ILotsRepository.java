package com.fsts.magasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsts.magasin.entities.LotsEntite;

public interface ILotsRepository extends JpaRepository<LotsEntite, Long>{

}
