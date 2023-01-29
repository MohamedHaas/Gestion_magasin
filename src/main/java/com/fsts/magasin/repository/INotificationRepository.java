package com.fsts.magasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsts.magasin.entities.NotificationEntite;

public interface INotificationRepository extends JpaRepository<NotificationEntite, Long> {

}
