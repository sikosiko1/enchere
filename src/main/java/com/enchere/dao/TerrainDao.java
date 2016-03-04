package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.Terrain;

@Repository
public class TerrainDao implements ITerrainDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Terrain terrain) {
		// TODO Auto-generated method stub
		em.persist(terrain);
		return true;
	}

	@Override
	public boolean update(Terrain terrain) {

		// TODO Auto-generated method stub
		em.merge(terrain);
		return true;
	}

	@Override
	public boolean delete(Terrain terrain) {
		// TODO Auto-generated method stub
		em.remove(terrain);
		return true;
	}

}
