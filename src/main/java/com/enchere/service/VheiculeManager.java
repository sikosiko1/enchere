package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enchere.dao.IVehiculeDao;
import com.enchere.models.Vehicule;
@Service
public class VheiculeManager implements IVehiculeManager{
@Autowired
IVehiculeDao IVehiculeDAO;
	@Override
	public boolean create(Vehicule vheicule) {
		// TODO Auto-generated method stub
		IVehiculeDAO.create(vheicule);
		return true;
	}

	@Override
	public boolean update(Vehicule vheicule) {
		// TODO Auto-generated method stub
		IVehiculeDAO.update(vheicule);
		return true;
	}

	@Override
	public boolean delete(Vehicule vheicule) {
		// TODO Auto-generated method stub
		IVehiculeDAO.delete(vheicule);
		return true;
	}

}
