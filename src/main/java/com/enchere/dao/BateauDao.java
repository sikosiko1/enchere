package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.Bateau;

@Repository
public class BateauDao implements IBateauDao {

	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Bateau bateau) {
		// TODO Auto-generated method stub
		em.persist(bateau);
		return true;
	}

	@Override
	public boolean update(Bateau bateau) {
		// TODO Auto-generated method stub
		em.merge(bateau);
		return true;
	}

	@Override
	public boolean delete(Bateau bateau) {
		// TODO Auto-generated method stub
		em.merge(bateau);
		return true;
	}

}
