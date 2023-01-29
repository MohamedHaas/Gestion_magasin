package com.fsts.magasin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Notification")
@Data @NoArgsConstructor @AllArgsConstructor
public class NotificationEntite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;

    @Column(name = "MESSAGE")
    private String message;

    @Column(name = "URL")
    private String url;

}
