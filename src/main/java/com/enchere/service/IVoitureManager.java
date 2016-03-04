package com.enchere.service;

import com.enchere.models.Voiture;

public interface IVoitureManager {
	
	public boolean create(Voiture vheicule);

	public boolean update(Voiture vheicule);

	public boolean delete(Voiture vheicule);
}
