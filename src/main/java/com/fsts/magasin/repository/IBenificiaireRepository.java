package com.fsts.magasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsts.magasin.entities.BenificiaireEntite;

public interface IBenificiaireRepository extends JpaRepository<BenificiaireEntite, Long> {

}
