package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.MaisonEnfant;

@Repository
public class MaisonEnfantDao implements IMaisonEnfantDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(MaisonEnfant maisonEnfant) {
		// TODO Auto-generated method stub
		em.persist(maisonEnfant);
		return true;
	}

	@Override
	public boolean update(MaisonEnfant maisonEnfant) {
		// TODO Auto-generated method stub
		em.merge(maisonEnfant);
		return true;
	}

	@Override
	public boolean delete(MaisonEnfant maisonEnfant) {
		// TODO Auto-generated method stub
		em.remove(maisonEnfant);
		return true;
	}

}
