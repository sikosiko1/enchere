package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enchere.dao.IMaisonEnfantDao;
import com.enchere.models.MaisonEnfant;

@Service
public class MaisonEnfantManager implements IMaisonEnfantManager {

	@Autowired
	IMaisonEnfantDao IMaisonEnfantDAO;
	@Override
	public boolean create(MaisonEnfant maisonEnfant) {
		// TODO Auto-generated method stub
		IMaisonEnfantDAO.create(maisonEnfant);	
		return true;
	}

	@Override
	public boolean update(MaisonEnfant maisonEnfant) {
		// TODO Auto-generated method stub
		IMaisonEnfantDAO.update(maisonEnfant);
		
		return true;
	}

	@Override
	public boolean delete(MaisonEnfant maisonEnfant) {
		// TODO Auto-generated method stub
		IMaisonEnfantDAO.delete(maisonEnfant);
		
		return true;
	}

}
