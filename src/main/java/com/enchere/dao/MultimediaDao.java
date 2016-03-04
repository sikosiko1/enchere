package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.Annonces;
import com.enchere.models.Multimedia;

@Repository
public class MultimediaDao implements IMultimediaDao{
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Multimedia multimedia) {
		// TODO Auto-generated method stub
		em.persist(multimedia);
		return true;
	}

	@Override
	public boolean update(Multimedia multimedia) {
		// TODO Auto-generated method stub
		em.merge(multimedia);
		return true;
	}

	@Override
	public boolean delete(Multimedia multimedia) {
		// TODO Auto-generated method stub
		em.remove(multimedia);
		return true;
	}
	

}
