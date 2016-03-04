package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enchere.dao.IMarqueDao;
import com.enchere.models.Marque;
@Service
public class MarqueManager implements IMarqueManager{

	@Autowired
	IMarqueDao IMarqueDAO; 
	@Override
	public boolean create(Marque marque) {
		// TODO Auto-generated method stub
		IMarqueDAO.create(marque);
		return true;
	}

	@Override
	public boolean update(Marque marque) {
		// TODO Auto-generated method stub
		IMarqueDAO.update(marque);
		return true;
	}

	@Override
	public boolean delete(Marque marque) {
		// TODO Auto-generated method stub
		IMarqueDAO.delete(marque);
		return true;
	}
	
	

}
