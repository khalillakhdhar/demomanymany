package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Categorie;

public interface CategorieRepo extends JpaRepository<Categorie, Long> {

}
