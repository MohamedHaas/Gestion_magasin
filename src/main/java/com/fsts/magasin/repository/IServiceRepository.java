package com.fsts.magasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsts.magasin.entities.ServiceEntite;

public interface IServiceRepository extends JpaRepository<ServiceEntite, Long> {

}
