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
import java.util.List;

@Entity
@Table(name = "SERVICE")
@Data @NoArgsConstructor @AllArgsConstructor
public class ServiceEntite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;

    @Column(name = "NOM_SERVICE", nullable = false)
    private String nom;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany
    @JoinColumn(name = "ID_SERVICE")
    private List<BenificiaireEntite> benificiaires;
}
