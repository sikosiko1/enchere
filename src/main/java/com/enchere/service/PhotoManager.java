package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enchere.dao.IPhotoDao;
import com.enchere.models.Photo;

@Service
public class PhotoManager implements IPhotoManager{

	@Autowired
	IPhotoDao IPhotoDAO ;
	
	@Override
	public boolean create(Photo photo) {
		// TODO Auto-generated method stub
		IPhotoDAO.create(photo);
		return true;
	}

	@Override
	public boolean update(Photo photo) {
		// TODO Auto-generated method stub
		IPhotoDAO.update(photo);
		return true;
	}

	@Override
	public boolean delete(Photo photo) {
		// TODO Auto-generated method stub
		IPhotoDAO.delete(photo);
		return true;
	}
	

}
