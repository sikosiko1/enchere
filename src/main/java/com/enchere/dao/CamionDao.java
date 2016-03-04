package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.Camion;

@Repository
public class CamionDao implements ICamionDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Camion camion) {
		// TODO Auto-generated method stub
		em.persist(camion);
		return true;
	}

	@Override
	public boolean update(Camion camion) {
		// TODO Auto-generated method stub
		em.merge(camion);
		return true;
	}

	@Override
	public boolean delete(Camion camion) {
		// TODO Auto-generated method stub
		em.remove(camion);
		return true;
	}

}
