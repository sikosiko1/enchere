package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.TypeAnnonce;

@Repository
public class TypeAnnonceDao implements ITypeAnnonceDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(TypeAnnonce typeAnnonce) {
		// TODO Auto-generated method stub
	
		em.persist(typeAnnonce);
		return true;
	}

	@Override
	public boolean update(TypeAnnonce typeAnnonce) {
		// TODO Auto-generated method stub
		em.merge(typeAnnonce);
		return true;
	}

	@Override
	public boolean delete(TypeAnnonce typeAnnonce) {
		// TODO Auto-generated method stub
		em.remove(typeAnnonce);
		return true;
	}

}
