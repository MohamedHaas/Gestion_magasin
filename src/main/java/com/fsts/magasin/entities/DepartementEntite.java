package com.fsts.magasin.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DEPARTEMENT")
@Data @NoArgsConstructor @AllArgsConstructor
public class DepartementEntite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;

    @Column(name = "NOM_DEPARTEMENT", nullable = false)
    private String nom;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany
    @JoinColumn(name = "ID_DEPARTEMENT")
    private List<BenificiaireEntite> benificiaires;
}
