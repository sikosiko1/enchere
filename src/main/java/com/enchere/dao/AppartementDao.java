package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.Appartement;

@Repository
public class AppartementDao implements IAppartementDao{

	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Appartement appartement) {
		//: TODO Auto-generated method stub
		em.persist(appartement);
		return true ;
	}

	@Override
	public boolean update(Appartement appartement) {
		// TODO Auto-generated method stub
		em.merge(appartement);
		return true;
	}

	@Override
	public boolean delete(Appartement appartement) {
		// TODO Auto-generated method stub
		em.remove(appartement);
		return true;
	}
	

	
}
