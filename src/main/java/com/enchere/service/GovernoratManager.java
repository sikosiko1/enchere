package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enchere.dao.IGovernoratDao;
import com.enchere.models.Governorat;

@Service
public class GovernoratManager implements IGovernoratManager {
	
	@Autowired
	IGovernoratDao governoratDAO;

	@Override
	public boolean create(Governorat governorat) {
		// TODO Auto-generated method stub
		governoratDAO.create(governorat);
		return true;
	}

	@Override
	public boolean update(Governorat governorat) {
		// TODO Auto-generated method stub
		governoratDAO.update(governorat);
		return true;
	}

	@Override
	public boolean delete(Governorat governorat) {
		// TODO Auto-generated method stub
		governoratDAO.create(governorat);
		return true;
	}

}
