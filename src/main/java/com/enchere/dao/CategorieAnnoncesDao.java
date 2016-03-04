package com.enchere.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.enchere.models.CategorieAnnonces;

@Repository
public class CategorieAnnoncesDao implements ICategorieAnnoncesDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(CategorieAnnonces categorie) {
		// TODO Auto-generated method stub
		em.persist(categorie);
		return true;
	}

	@Override
	public boolean update(CategorieAnnonces categorie) {
		// TODO Auto-generated method stub
		em.merge(categorie);
		return true;
	}

	@Override
	public boolean delete(CategorieAnnonces categorie) {
		// TODO Auto-generated method stub
		em.remove(categorie);
		return true;
	}

}
