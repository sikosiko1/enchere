package com.enchere.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity

@NamedQuery(name = "findByCredentials", query = "select i from Client i where i.login =:login AND i.motDePasse =:motDePasse")

public class Client {
	private int id;
    private String email ;
    private String login;
    private String motDePasse;
    private String nom;
    private String prenom;
    private int telephone;
	
	public Client() {

	}

	private List<Annonces> annonces;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	@OneToMany(mappedBy="client")
	public List<Annonces> getAnnonces() {
		return annonces;
	}

	public void setAnnonces(List<Annonces> annonces) {
		this.annonces = annonces;
	}

	public String getEmail() {
		return email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Client(String email, String login, String motDePasse, String nom,
			String prenom, int telephone, List<Annonces> annonces) {
		super();
		this.email = email;
		this.login = login;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.annonces = annonces;
	}
}
