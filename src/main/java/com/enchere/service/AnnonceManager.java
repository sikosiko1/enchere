package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.enchere.dao.IAnnonceDao;
import com.enchere.models.Annonces;

@Service
@Transactional
public class AnnonceManager implements IAnnonceManager{

	@Autowired
	private IAnnonceDao IAnnonceDAO;
	@Override
	public boolean create(Annonces annonce) {
		// TODO Auto-generated method stub
		IAnnonceDAO.create(annonce);
		return true;
	}

	@Override
	public boolean update(Annonces annonce) {
		// TODO Auto-generated method stub
		IAnnonceDAO.update(annonce);
		return true;
	}

	@Override
	public boolean delete(Annonces annonce) {
		// TODO Auto-generated method stub
		IAnnonceDAO.delete(annonce);
		return true;
	}

	@Override
	public Annonces findById(int id) {
		// TODO Auto-generated method stub
		
		return IAnnonceDAO.findById(id);
	}
	
	
	


}
