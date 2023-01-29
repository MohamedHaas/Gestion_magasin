package com.fsts.magasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsts.magasin.entities.UserEntite;

public interface IUserRepository extends JpaRepository<UserEntite, Long> {

}
