package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.enchere.dao.IElectromenagerDao;
import com.enchere.models.Electromenager;

@Service
public class ElectromenagerManager implements IElectromenagerManager{
	
	@Autowired
	IElectromenagerDao electromenagerDAO;

	@Override
	public boolean create(Electromenager electromenager) {
		// TODO Auto-generated method stub
		electromenagerDAO.create(electromenager);
		return true;
	}

	@Override
	public boolean update(Electromenager electromenager) {
		// TODO Auto-generated method stub
		electromenagerDAO.update(electromenager);
		return true;
	}

	@Override
	public boolean delete(Electromenager electromenager) {
		// TODO Auto-generated method stub
		electromenagerDAO.delete(electromenager);
		return true;
	}

}
