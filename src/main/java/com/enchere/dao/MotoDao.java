package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.Annonces;
import com.enchere.models.Moto;

@Repository
public class MotoDao implements IMotoDao{
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Moto moto) {
		// TODO Auto-generated method stub
		em.persist(moto);
		return true;
	}

	@Override
	public boolean update(Moto moto) {
		// TODO Auto-generated method stub
		em.merge(moto);
		return true;
	}

	@Override
	public boolean delete(Moto moto) {
		// TODO Auto-generated method stub
		em.remove(moto);
		return true;
	}
	
	
}
