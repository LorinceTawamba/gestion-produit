package com.iuc.cs2i4.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "produit")
@Table(name = "produit")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nom", unique = true, length = 60)
    private String nom;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "qté")
    private int qte;

    @Column(name = "prix")
    private double prix;
}
