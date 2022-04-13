package com.iuc.cs2i4.service;

import com.iuc.cs2i4.dao.ProduitRepository;
import com.iuc.cs2i4.entity.Produit;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProduitService {
    private ProduitRepository produitRepository;

    public Produit ajouterProduit(Produit produit) {
        Produit resultat = null;
        resultat = produitRepository.save(produit);
        return resultat;
    }

}
