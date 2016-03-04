package com.enchere.models;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Vehicule extends Annonces{

	
	private int anneeModele;
	
	private String conditions;

	
	public int getAnneeModele() {
		return anneeModele;
	}

	
	public String getConditions() {
		return conditions;
	}

	

	public void setAnneeModele(int anneeModele) {
		this.anneeModele = anneeModele;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	
	
	
	
	
	
	
}
