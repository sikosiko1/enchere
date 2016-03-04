package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enchere.dao.IMotoDao;
import com.enchere.models.Moto;
@Service
public class MotoManager implements IMotoManager{
@Autowired
IMotoDao IMotoDAO; 
	@Override
	public boolean create(Moto moto) {
		// TODO Auto-generated method stub
		IMotoDAO.create(moto);
		return true;
	}

	@Override
	public boolean update(Moto moto) {
		// TODO Auto-generated method stub
		IMotoDAO.update(moto);
		return true;
	}

	@Override
	public boolean delete(Moto moto) {
		// TODO Auto-generated method stub
		IMotoDAO.delete(moto);
		return true;
	}

}
