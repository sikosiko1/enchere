package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enchere.dao.IMultimediaDao;
import com.enchere.models.Multimedia;

@Service
public class MultimediaManager implements IMultimediaManager{
	@Autowired
	IMultimediaDao IMultimediaDAO;
	
	
	@Override
	public boolean create(Multimedia multimedia) {
		// TODO Auto-generated method stub
		IMultimediaDAO.create(multimedia);
		return true;
	}

	@Override
	public boolean update(Multimedia multimedia) {
		// TODO Auto-generated method stub
		IMultimediaDAO.update(multimedia);
		return true;
	}

	@Override
	public boolean delete(Multimedia multimedia) {
		// TODO Auto-generated method stub
		IMultimediaDAO.delete(multimedia);
		return true;
	}

}
