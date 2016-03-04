package com.enchere.service;

import com.enchere.models.CategorieAnnonces;

public interface ICategorieAnnonceManager {


	public boolean create(CategorieAnnonces categorie);

	public boolean update(CategorieAnnonces categorie);

	public boolean delete(CategorieAnnonces categorie);
}