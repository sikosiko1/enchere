package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.Annonces;
import com.enchere.models.Interieur;

@Repository
public class InterieurDao implements IInterieurDao {

	@PersistenceContext
	EntityManager em;
	
	
	@Override
	public boolean create(Interieur interieur) {
		// TODO Auto-generated method stub
		em.persist(interieur);
		return true;
	}

	@Override
	public boolean update(Interieur interieur) {
		// TODO Auto-generated method stub
		
		em.merge(interieur);
		return true;
	}

	@Override
	public boolean delete(Interieur interieur) {
		// TODO Auto-generated method stub
		em.remove(interieur);
		
		return true;
	}

	



}
