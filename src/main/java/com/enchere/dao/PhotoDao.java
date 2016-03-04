package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.Annonces;
import com.enchere.models.Photo;

@Repository
public class PhotoDao implements IPhotoDao{
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Photo photo) {
		// TODO Auto-generated method stub
	em.persist(photo);
		return true;
	}

	@Override
	public boolean update(Photo photo) {
		// TODO Auto-generated method stub
		em.merge(photo);
		return true;
	}

	@Override
	public boolean delete(Photo photo) {
		// TODO Auto-generated method stub
		em.remove(photo);
		return true;
	}
	
	
}
