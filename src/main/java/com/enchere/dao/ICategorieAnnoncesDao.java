package com.enchere.dao;

import com.enchere.models.CategorieAnnonces;

public interface ICategorieAnnoncesDao {

	public boolean create(CategorieAnnonces categorie);

	public boolean update(CategorieAnnonces categorie);

	public boolean delete(CategorieAnnonces categorie);
}
