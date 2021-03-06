package com.enchere.models;

import javax.persistence.Entity;


@Entity
public class Appartement extends Immoblier {

	private int nombrePiece;

	private String placeParking;
	private int salleDeBain;
	private String Meuble;

	public int getNombrePiece() {
		return nombrePiece;
	}

	

	public String getPlaceParking() {
		return placeParking;
	}

	public int getSalleDeBain() {
		return salleDeBain;
	}

	public String getMeuble() {
		return Meuble;
	}

	public void setNombrePiece(int nombrePiece) {
		this.nombrePiece = nombrePiece;
	}

	

	public void setPlaceParking(String placeParking) {
		this.placeParking = placeParking;
	}

	public void setSalleDeBain(int salleDeBain) {
		this.salleDeBain = salleDeBain;
	}

	public void setMeuble(String meuble) {
		Meuble = meuble;
	}

}