package com.enchere.service;

import com.enchere.models.Annonces;

public interface IAnnonceManager {

	public boolean create(Annonces annonce);
	public boolean update(Annonces annonce);
	public boolean delete(Annonces annonce);
	public Annonces findById(int id);
}
