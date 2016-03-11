package com.enchere.dao;

import java.util.List;

import com.enchere.models.CategorieAnnonces;

public interface ICategorieAnnoncesDao {

	public boolean create(CategorieAnnonces categorie);

	public boolean update(CategorieAnnonces categorie);

	public boolean delete(CategorieAnnonces categorie);

	public CategorieAnnonces findByName(String libelle);

	public List<CategorieAnnonces> retrieveAll();

}
