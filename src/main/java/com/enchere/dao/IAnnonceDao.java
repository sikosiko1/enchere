package com.enchere.dao;

import java.util.List;

import com.enchere.models.Annonces;

public interface IAnnonceDao {

	public boolean create(Annonces annonce);
	public boolean update(Annonces annonce);
	public boolean delete(Annonces annonce);
	public Annonces findById(int id);
	public List<Annonces> retrieveAnnoncesByIdCategorie(int id);

}
