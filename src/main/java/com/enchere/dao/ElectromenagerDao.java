package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.Electromenager;

@Repository
public class ElectromenagerDao implements IElectromenagerDao {

	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Electromenager electromenager) {
		// TODO Auto-generated method stub
		em.persist(electromenager);
		return true;
	}

	@Override
	public boolean update(Electromenager electromenager) {
		// TODO Auto-generated method stub
		em.merge(electromenager);
		return true;
	}

	@Override
	public boolean delete(Electromenager electromenager) {
		// TODO Auto-generated method stub
		em.remove(electromenager);
		return true;
	}

}
