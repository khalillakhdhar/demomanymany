package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class Categorie implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String titre;

@ManyToMany(fetch = FetchType.EAGER)
private List<Product> products;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
@Override
public String toString() {
	return "Categorie [id=" + id + ", titre=" + titre + "]";
}
public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
public Categorie(String titre) {
	super();
	this.titre = titre;
}
public Categorie() {
	super();
	// TODO Auto-generated constructor stub
}


}
