package com.fsts.magasin.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "USER")
@Data @NoArgsConstructor @AllArgsConstructor
public class UserEntite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;

    @Column(name = "DATE_CREATION" , nullable = false)
    private Date creationDate;

    @Column(name = "DATE_DERNIERE_MODIFICATION")
    private Date lastModifiDate;

    @Column(name = "NOM" , nullable = false)
    private String nom;

    @Column(name = "PRENOM", nullable = false)
    private String prenom;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "NUMERO_TELEPHONE")
    private String numTel;

    @Column(name = "LOGIN", nullable = false)
    private String login;

    @Column(name = "PASSWORD", nullable = false)
    private String PWD;

    @Column(name = "ROLE")
    private String role;

    @OneToMany
    @JoinColumn(name = "ID_USER")
    private List<NotificationEntite> notifications;
}
