package com.enchere.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Photo {
	private int id;
	private String chemin;
	private Annonces annonces;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChemin() {
		return chemin;
	}

	public void setChemin(String chemin) {
		this.chemin = chemin;
	}

	
	@ManyToOne
	public Annonces getAnnonces() {
		return annonces;
	}

	public void setAnnonces(Annonces annonces) {
		this.annonces = annonces;
	}

}
