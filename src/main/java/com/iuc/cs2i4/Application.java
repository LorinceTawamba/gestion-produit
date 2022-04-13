package com.iuc.cs2i4;

import com.iuc.cs2i4.dao.ProduitRepository;
import com.iuc.cs2i4.entity.Produit;
import com.iuc.cs2i4.service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@AllArgsConstructor
public class Application {

    private ProduitService produitService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner start() {
        return args -> {
            System.out.println("==== DEBUT DU PROGRAMME ====");
            Produit produit = new Produit();
            produit.setNom("IUC61");
            produit.setDescription("R.A.S.");
            produit.setQte(5);
            produit.setPrix(430.34);

            produitService.ajouterProduit(produit);
        };
    }

}
