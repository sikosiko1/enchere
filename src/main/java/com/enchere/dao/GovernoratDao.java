package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.Governorat;

@Repository
public class GovernoratDao implements IGovernoratDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Governorat governorat) {
		// TODO Auto-generated method stub
		em.persist(governorat);
		return true;
	}

	@Override
	public boolean update(Governorat governorat) {
		// TODO Auto-generated method stub
		em.merge(governorat);
		return true;
	}

	@Override
	public boolean delete(Governorat governorat) {
		// TODO Auto-generated method stub

		em.remove(governorat);
		return true;
	}

}
