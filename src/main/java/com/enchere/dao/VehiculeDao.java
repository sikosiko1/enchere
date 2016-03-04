package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.Vehicule;

@Repository
public class VehiculeDao implements IVehiculeDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Vehicule vheicule) {
		// TODO Auto-generated method stub

		em.persist(vheicule);
		return true;
	}

	@Override
	public boolean update(Vehicule vheicule) {
		// TODO Auto-generated method stub7
		em.merge(vheicule);
		return true;
	}

	@Override
	public boolean delete(Vehicule vheicule) {
		// TODO Auto-generated method stub
		em.remove(vheicule);
		return true;
	}

}
