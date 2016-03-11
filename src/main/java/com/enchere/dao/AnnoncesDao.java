package com.enchere.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.enchere.models.Annonces;
import com.enchere.models.CategorieAnnonces;

@Repository
public class AnnoncesDao implements IAnnonceDao {

	@PersistenceContext
	EntityManager em;
	
	
	@Override
	public boolean create(Annonces annonce) {
		// TODO Auto-generated method stub
		em.persist(annonce);
		return true;
	}

	@Override
	public boolean update(Annonces annonce) {
		// TODO Auto-generated method stub
		
		em.merge(annonce);
		return true;
	}

	@Override
	public boolean delete(Annonces annonce) {
		// TODO Auto-generated method stub
		em.remove(annonce);
		
		return true;
	}

	@Override
	public Annonces findById(int id) {
		// TODO Auto-generated method stub
		TypedQuery<Annonces> query = em.createNamedQuery("findAnnonceById",
				Annonces.class);
		query.setParameter("id", id);

		return query.getSingleResult();	}

	@Override
	public List<Annonces> retrieveAnnoncesByIdCategorie(int idAnnonce) {
		// TODO Auto-generated method stub
		TypedQuery<Annonces> query = em.createNamedQuery("findListAnnoncesByCategorieId",
				Annonces.class);
		query.setParameter("idAnnonce", idAnnonce);

		return query.getResultList();	}	



}
