package com.enchere.models;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Multimedia extends Annonces{
	private String libelleMultimedia;
	private String conditions;  // neuf ou occasion
	
	




	
	public String getConditions() {
		return conditions;
	}


	public void setConditions(String conditions) {
		this.conditions = conditions;
	}




	public String getLibelleMultimedia() {
		return libelleMultimedia;
	}


	public void setLibelleMultimedia(String libelleMultimedia) {
		this.libelleMultimedia = libelleMultimedia;
	}
}
