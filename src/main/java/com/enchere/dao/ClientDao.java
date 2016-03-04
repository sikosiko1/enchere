package com.enchere.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.enchere.Exceptions.BadCredentialException;
import com.enchere.models.Client;

@Repository
public class ClientDao implements IClientDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public boolean create(Client client) {
		// TODO Auto-generated method stub
		em.persist(client);
		return true;
	}

	@Override
	public boolean update(Client client) {
		// TODO Auto-generated method stub
		em.merge(client);
		return true;
	}

	@Override
	public boolean delete(Client client) {
		// TODO Auto-generated method stub
		em.remove(client);
		return true;
	}

	@Override
	public Client retrieveByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> retrieveAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findByname(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findBylogin(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findByEmail(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client retrieveByCredentials(String username, String password)
			throws BadCredentialException {
		// TODO Auto-generated method stub

		TypedQuery<Client> query = em.createNamedQuery("findByCredentials",
				Client.class);
		query.setParameter("login", username);
		query.setParameter("motDePasse", password);
		try {
			return query.getSingleResult();
		} catch (NoResultException ex) {
			throw new BadCredentialException();
		}
	}

}