package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enchere.dao.IBateauDao;
import com.enchere.dao.ICamionDao;
import com.enchere.models.Camion;

@Service
public class CamionManager implements ICamionManager {
	
	@Autowired
	ICamionDao camionDAO;

	@Override
	public boolean create(Camion camion) {
		// TODO Auto-generated method stub
		camionDAO.create(camion);
		return true;
	}

	@Override
	public boolean update(Camion camion) {
		// TODO Auto-generated method stub
		camionDAO.update(camion);
		return true;
	}

	@Override
	public boolean delete(Camion camion) {
		// TODO Auto-generated method stub
		camionDAO.delete(camion);
		return true;
	}

}
