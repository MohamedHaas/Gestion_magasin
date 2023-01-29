package com.fsts.magasin.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "LABORATOIRE")
@Data @NoArgsConstructor @AllArgsConstructor
public class LaboratoireEntite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
    private Long id;

    @Column(name = "NOM_LABORATOIRE", nullable = false)
    private String nom;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany
    @JoinColumn(name = "ID_LABORATOIRE")
    private List<BenificiaireEntite> benificiaires;
}
