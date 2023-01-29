package com.fsts.magasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsts.magasin.entities.MarcheEntite;

public interface IMarcheRepository extends JpaRepository<MarcheEntite, Long> {

}
