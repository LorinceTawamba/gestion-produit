package com.iuc.cs2i4.controller;

import com.iuc.cs2i4.entity.Produit;
import com.iuc.cs2i4.service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/produit/")
@AllArgsConstructor
public class ProduitController {
    private ProduitService produitService;

    @PostMapping(path = "add")
    public Produit addProduct(@RequestBody Produit produit) {
        Produit prod = null;
        prod = produitService.ajouterProduit(produit);
        return prod;
    }
}
