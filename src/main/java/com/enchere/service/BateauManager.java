package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enchere.dao.IBateauDao;
import com.enchere.models.Bateau;



@Service
public class BateauManager  implements IBateauManager{

	@Autowired
	IBateauDao bateauDAO;
	
	@Override
	public boolean create(Bateau bateau) {
		// TODO Auto-generated method stub
		bateauDAO.create(bateau);
		
		return true;
	}

	@Override
	public boolean update(Bateau bateau) {
		// TODO Auto-generated method
		bateauDAO.update(bateau);
		return true;
	}

	@Override
	public boolean delete(Bateau bateau) {
		// TODO Auto-generated method stub
		bateauDAO.delete(bateau);
		return true;
	}

}
