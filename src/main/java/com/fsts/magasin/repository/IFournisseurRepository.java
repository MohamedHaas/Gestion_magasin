package com.fsts.magasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsts.magasin.entities.FournisseurEntite;

public interface IFournisseurRepository extends JpaRepository<FournisseurEntite, Long>{

}
