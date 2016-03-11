package com.enchere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enchere.dao.ICategorieAnnoncesDao;
import com.enchere.models.CategorieAnnonces;

@Service
public class CategorieAnnonceManager implements ICategorieAnnonceManager {

	@Autowired
	ICategorieAnnoncesDao categorieDAO;

	@Override
	public boolean create(CategorieAnnonces categorie) {
		// TODO Auto-generated method stub
		categorieDAO.create(categorie);
		return true;
	}

	@Override
	public boolean update(CategorieAnnonces categorie) {
		// TODO Auto-generated method stub
		categorieDAO.update(categorie);
		return true;
	}

	@Override
	public boolean delete(CategorieAnnonces categorie) {
		// TODO Auto-generated method stub
		categorieDAO.delete(categorie);
		return true;
	}

	@Override
	public CategorieAnnonces findByName(String libelle) {
		// TODO Auto-generated method stub
		return categorieDAO.findByName(libelle);
	}

	@Override
	public List<CategorieAnnonces> retrieveAll() {
		// TODO Auto-generated method stub
		return categorieDAO.retrieveAll();
	}

}
