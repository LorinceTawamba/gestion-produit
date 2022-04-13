package com.iuc.cs2i4.service;

import com.fasterxml.jackson.core.PrettyPrinter;
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

    public Produit miseAjourProduit(Long id, Produit produit) {
        Produit resultat = null;
        resultat = produitRepository.findById(id).get();
        if (resultat != null) {
            if (!produit.getNom().isEmpty()) {
                resultat.setNom(produit.getNom());
            }
            if (!produit.getDescription().isEmpty()) {
                resultat.setDescription(produit.getDescription());
            }
            resultat.setQte(produit.getQte());
            resultat.setPrix(produit.getPrix());

            resultat = produitRepository.save(resultat);
        }
        return resultat;
    }

}
