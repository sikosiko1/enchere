package com.enchere.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Governorat {

	private int id;
	private String libelle;
	private List<Annonces> annonces;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	
	@OneToMany(mappedBy="governorat")
	public List<Annonces> getAnnonces() {
		return annonces;
	}

	public void setAnnonces(List<Annonces> annonces) {
		this.annonces = annonces;
	}
}
