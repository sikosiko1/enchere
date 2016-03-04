package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.Annonces;
import com.enchere.models.Maison;

@Repository
public class MaisonDao implements IMaisonDao{
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Maison maison) {
		// TODO Auto-generated method stub
		em.persist(maison);
		return true;
	}

	@Override
	public boolean update(Maison maison) {
		// TODO Auto-generated method stub
		em.merge(maison);
		return true;
	}

	@Override
	public boolean delete(Maison maison) {
		// TODO Auto-generated method stub
		em.remove(maison);
		return true;
	}
	
	

}
