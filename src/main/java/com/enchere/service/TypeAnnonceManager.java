package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enchere.dao.ITypeAnnonceDao;
import com.enchere.models.TypeAnnonce;
@Service
public class TypeAnnonceManager implements ITypeAnnonceManager{
@Autowired
	ITypeAnnonceDao ITypeAnnonceDAO;
	@Override
	public boolean create(TypeAnnonce typeAnnonce) {
		// TODO Auto-generated method stub
		ITypeAnnonceDAO.create(typeAnnonce);
		return true;
	}

	@Override
	public boolean update(TypeAnnonce typeAnnonce) {
		// TODO Auto-generated method stub
		ITypeAnnonceDAO.update(typeAnnonce);
		return true;
	}

	@Override
	public boolean delete(TypeAnnonce typeAnnonce) {
		// TODO Auto-generated method stub
		ITypeAnnonceDAO.delete(typeAnnonce);
		return true;
	}

}
