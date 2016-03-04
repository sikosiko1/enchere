package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.enchere.dao.IAppartementDao;
import com.enchere.models.Appartement;

@Service
public class AppartementManager implements IAppartementManager{
@Autowired

IAppartementDao IAppartementDAO;
	@Override
	public boolean create(Appartement appartement) {
		// TODO Auto-generated method stub
		IAppartementDAO.create(appartement);
		return true;
	}

	@Override
	public boolean update(Appartement appartement) {
		// TODO Auto-generated method stub
		IAppartementDAO.update(appartement);
		return true;
	}

	@Override
	public boolean delete(Appartement appartement) {
		// TODO Auto-generated method stub
		IAppartementDAO.delete(appartement);
		return true;
	}

}
