package com.enchere.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

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

	@Override
	public CategorieAnnonces findByName(String libelle) {
		// TODO Auto-generated method stub
		TypedQuery<CategorieAnnonces> query = em.createNamedQuery("findByName",
				CategorieAnnonces.class);
		query.setParameter("libelle", libelle);

		return query.getSingleResult();
	}

	@Override
	public List<CategorieAnnonces> retrieveAll() {
		// TODO Auto-generated method stub
		TypedQuery<CategorieAnnonces> query = em.createQuery(
				"SELECT m FROM CategorieAnnonces m", CategorieAnnonces.class);

		return query.getResultList();
	}

}
