package com.enchere.dao;

import com.enchere.models.Annonces;

public interface IAnnonceDao {

	public boolean create(Annonces annonce);
	public boolean update(Annonces annonce);
	public boolean delete(Annonces annonce);
	public Annonces findById(int id);

}
