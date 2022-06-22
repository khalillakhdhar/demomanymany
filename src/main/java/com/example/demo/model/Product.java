package com.example.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(nullable = false)
private String titre;
@Column(nullable = true)
private String description;
@ManyToMany(fetch = FetchType.EAGER)
private List<Categorie> categories=new ArrayList<Categorie>();

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
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

public Product(String titre, String description) {
	super();
	this.titre = titre;
	this.description = description;
}
public List<Categorie> getCategories() {
	return categories;
}
public void setCategories(List<Categorie> categories) {
	this.categories = categories;
}
public Product(String titre, String description, List<Categorie> categories) {
	super();
	this.titre = titre;
	this.description = description;
	this.categories = categories;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Product [id=" + id + ", titre=" + titre + ", description=" + description + ", categories=" + categories
			+ "]";
}






}
