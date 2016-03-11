package com.enchere.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQuery(name = "findByName", query = "select i from CategorieAnnonces i where i.libelle =:libelle")

public class CategorieAnnonces {
	private int id;
	private String libelle;
	private List<Annonces> annonces;
	private String urlPhoto;
	
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
	
	@OneToMany(mappedBy="categorie")
	public List<Annonces> getAnnonces() {
		return annonces;
	}
	public void setAnnonces(List<Annonces> annonces) {
		this.annonces = annonces;
	}
	public String getUrlPhoto() {
		return urlPhoto;
	}
	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	} 	
	
}
