package com.enchere.models;

import javax.persistence.Entity;

@Entity
public class Moto extends Vehicule {

	private int kilomMax;
	private int cylindre;

	public int getCylindre() {
		return cylindre;
	}

	public void setCylindre(int cylindre) {
		this.cylindre = cylindre;
	}

	public int getKilomMax() {
		return kilomMax;
	}

	public void setKilomMax(int kilomMax) {
		this.kilomMax = kilomMax;
	}

}