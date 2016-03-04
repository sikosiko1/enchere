package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.Immoblier;

@Repository
public class ImmobilierDao implements IImmobilierDao {

	@PersistenceContext
	EntityManager em;
	
	
	@Override
	public boolean create(Immoblier immobilier) {
		// TODO Auto-generated method stub
		em.persist(immobilier);
		return true;
	}

	@Override
	public boolean update(Immoblier immobilier) {
		// TODO Auto-generated method stub
		
		em.merge(immobilier);
		return true;
	}

	@Override
	public boolean delete(Immoblier immobilier) {
		// TODO Auto-generated method stub
		em.remove(immobilier);
		
		return true;
	}

	



}
