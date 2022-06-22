package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Categorie;
import com.example.demo.model.Product;
import com.example.demo.repositories.CategorieRepo;
import com.example.demo.repositories.JoinService;
import com.example.demo.repositories.ProductRepository;

@SpringBootApplication
public class DemomanymanyApplication implements CommandLineRunner{

	@Autowired 
	ProductRepository prodapi;
	@Autowired
	CategorieRepo categorieRepo;
	@Autowired
	JoinService joinapi;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemomanymanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categorie cat=categorieRepo.save(new Categorie("teste"));
		Product pr2 =new Product("produit2","prod");
Product pr=new Product("prod","pr");	
joinapi.addProduitwithCat(pr, cat);
joinapi.addProduitwithCat(pr2, cat);
prodapi.findAll().forEach(prd->{
	System.out.println(prd.toString());
	
});

		
		
	}

}
