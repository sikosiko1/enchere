package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.Marque;

@Repository
public class MarqueDao implements IMarqueDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Marque marque) {
		// TODO Auto-generated method stub
		em.persist(marque);
		return true;
	}

	@Override
	public boolean update(Marque marque) {
		// TODO Auto-generated method stub
		em.merge(marque);
		return true;
	}

	@Override
	public boolean delete(Marque marque) {
		// TODO Auto-generated method stub
		em.remove(marque);
		return true;
	}

}
