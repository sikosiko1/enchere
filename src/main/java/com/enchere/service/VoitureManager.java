package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enchere.dao.IVoitureDao;
import com.enchere.models.Voiture;
@Service
public class VoitureManager implements IVoitureManager{
@Autowired
	IVoitureDao IVoitureDAO;

	@Override
	public boolean create(Voiture vheicule) {
		// TODO Auto-generated method stub
		IVoitureDAO.create(vheicule);
		return true;
	}

	@Override
	public boolean update(Voiture vheicule) {
		// TODO Auto-generated method stub
		IVoitureDAO.update(vheicule);
		return true;
	}

	@Override
	public boolean delete(Voiture vheicule) {
		// TODO Auto-generated method stub
		IVoitureDAO.delete(vheicule);
		return true;
	}

}
