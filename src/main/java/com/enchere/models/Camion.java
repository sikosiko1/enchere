package com.enchere.models;

import javax.persistence.Entity;


@Entity
public class Camion extends Vehicule{
	


private int kilMax;
private String energies;
public int getKilMax() {
	return kilMax;
}
public String getEnergies() {
	return energies;
}
public void setKilMax(int kilMax) {
	this.kilMax = kilMax;
}
public void setEnergies(String energies) {
	this.energies = energies;
}
	
	

}
