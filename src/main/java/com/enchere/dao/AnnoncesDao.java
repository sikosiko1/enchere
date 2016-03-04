package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.Annonces;

@Repository
public class AnnoncesDao implements IAnnonceDao {

	@PersistenceContext
	EntityManager em;
	
	
	@Override
	public boolean create(Annonces annonce) {
		// TODO Auto-generated method stub
		em.persist(annonce);
		return true;
	}

	@Override
	public boolean update(Annonces annonce) {
		// TODO Auto-generated method stub
		
		em.merge(annonce);
		return true;
	}

	@Override
	public boolean delete(Annonces annonce) {
		// TODO Auto-generated method stub
		em.remove(annonce);
		
		return true;
	}

	@Override
	public Annonces findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



}
