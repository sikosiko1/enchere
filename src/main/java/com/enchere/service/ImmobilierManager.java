package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.enchere.dao.IImmobilierDao;
import com.enchere.models.Immoblier;
@Service
public class ImmobilierManager implements IImmobilierDao{

	
	@Autowired
	IImmobilierDao ImmobilierDAO;
	
	@Override
	public boolean create(Immoblier immobilier) {
		// TODO Auto-generated method stub
		ImmobilierDAO.create(immobilier);
		return true;
	}

	@Override
	public boolean update(Immoblier immobilier) {
		// TODO Auto-generated method stub
		ImmobilierDAO.update(immobilier);
		return true;
	}

	@Override
	public boolean delete(Immoblier immobilier) {
		// TODO Auto-generated method stub
		ImmobilierDAO.delete(immobilier);
		return true;
	}

}
