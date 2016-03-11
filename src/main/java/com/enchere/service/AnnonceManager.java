package com.enchere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.enchere.dao.IAnnonceDao;
import com.enchere.models.Annonces;

@Service
@Transactional
public class AnnonceManager implements IAnnonceManager{

	@Autowired
	private IAnnonceDao iAnnonceDAO;
	@Override
	public boolean create(Annonces annonce) {
		// TODO Auto-generated method stub
		iAnnonceDAO.create(annonce);
		return true;
	}

	@Override
	public boolean update(Annonces annonce) {
		// TODO Auto-generated method stub
		iAnnonceDAO.update(annonce);
		return true;
	}

	@Override
	public boolean delete(Annonces annonce) {
		// TODO Auto-generated method stub
		iAnnonceDAO.delete(annonce);
		return true;
	}

	@Override
	public Annonces findById(int id) {
		// TODO Auto-generated method stub
		
		return iAnnonceDAO.findById(id);
	}

	@Override
	public List<Annonces> retrieveAnnoncesByIdCategorie(int id) {
		// TODO Auto-generated method stub
		return iAnnonceDAO.retrieveAnnoncesByIdCategorie(id);
	}
	
	
	


}
