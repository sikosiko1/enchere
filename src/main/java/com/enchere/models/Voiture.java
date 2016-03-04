package com.enchere.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class Voiture extends Vehicule{
	
	private Marque marque;
	private int kilomMax;
	private String energies;
	private String boiteVitesse;
	private int puissanceFiscale;
	
	@ManyToOne
	public Marque getMarque() {
		return marque;
	}
	public int getKilomMax() {
		return kilomMax;
	}
	public String getEnergies() {
		return energies;
	}
	public String getBoiteVitesse() {
		return boiteVitesse;
	}
	public int getPuissanceFiscale() {
		return puissanceFiscale;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	public void setKilomMax(int kilomMax) {
		this.kilomMax = kilomMax;
	}
	public void setEnergies(String energies) {
		this.energies = energies;
	}
	public void setBoiteVitesse(String boiteVitesse) {
		this.boiteVitesse = boiteVitesse;
	}
	public void setPuissanceFiscale(int puissanceFiscale) {
		this.puissanceFiscale = puissanceFiscale;
	}

}