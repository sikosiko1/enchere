package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enchere.dao.IMaisonDao;
import com.enchere.models.Maison;
@Service
public class MaisonManager implements IMaisonManager{
@Autowired
IMaisonDao IMaisonDAO;
	@Override
	public boolean create(Maison maison) {
		// TODO Auto-generated method stub
	
		IMaisonDAO.create(maison);
		return true;
	}

	@Override
	public boolean update(Maison maison) {
		// TODO Auto-generated method stub
		IMaisonDAO.update(maison);
		return true;
	}

	@Override
	public boolean delete(Maison maison) {
		// TODO Auto-generated method stub
		IMaisonDAO.delete(maison);
		
		return true;
	}

}
