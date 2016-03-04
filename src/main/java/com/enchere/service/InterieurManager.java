package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.enchere.dao.IInterieurDao;
import com.enchere.models.Interieur;

@Service
public class InterieurManager implements IInterieurManager{


	@Autowired
	IInterieurDao InterieurDAO;
	
	
	@Override
	public boolean create(Interieur interieur) {
		// TODO Auto-generated method stub
		InterieurDAO.create(interieur);
		return true;
	}

	@Override
	public boolean update(Interieur interieur) {
		// TODO Auto-generated method stub
		InterieurDAO.update(interieur);
		return true;
	}

	@Override
	public boolean delete(Interieur interieur) {
		// TODO Auto-generated method stub
		InterieurDAO.delete(interieur);
		return true;
	}

}
