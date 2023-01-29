package com.fsts.magasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsts.magasin.entities.DepartementEntite;

public interface IDepartementRepository extends JpaRepository<DepartementEntite, Long> {

}
