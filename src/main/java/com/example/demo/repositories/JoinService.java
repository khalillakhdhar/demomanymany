package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Categorie;
import com.example.demo.model.Product;

@Service
public class JoinService {
@Autowired
CategorieRepo categorieRepo;
@Autowired
ProductRepository productRepository;
public void addProduitwithCat(Product product, Categorie categorie)
{
	Categorie cat=categorieRepo.findById(categorie.getId()).get();
	List<Categorie> cats=product.getCategories();
	cats.add(categorie);
	product.setCategories(cats);
	
	 productRepository.save(product);
	
	

}





}
