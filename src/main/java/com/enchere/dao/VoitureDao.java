package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.Voiture;

@Repository
public class VoitureDao implements IVoitureDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Voiture vheicule) {
		// TODO Auto-generated method stub

		em.persist(vheicule);
		return true;
	}

	@Override
	public boolean update(Voiture vheicule) {
		// TODO Auto-generated method stub
		em.merge(vheicule);

		return true;
	}

	@Override
	public boolean delete(Voiture vheicule) {
		// TODO Auto-generated method stub
		em.remove(vheicule);
		return true;
	}

}
