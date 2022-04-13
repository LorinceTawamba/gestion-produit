package com.iuc.cs2i4;

import com.iuc.cs2i4.dao.ProduitRepository;
import com.iuc.cs2i4.entity.Produit;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@AllArgsConstructor
public class Application {

    private ProduitRepository produitRepository;



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner start() {
        return args -> {
            System.out.println("==== DEBUT DU PROGRAMME ====");
            Produit produit = new Produit();
            produit.setNom("test");
            produit.setDescription("zra");
            produit.setQte(33);
            produit.setPrix(47575);

            produitRepository.save(produit);
        };
    }

}
