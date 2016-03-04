package com.enchere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.enchere.Exceptions.BadCredentialException;
import com.enchere.dao.IClientDao;
import com.enchere.models.Client;

@Service
public class ClientManager implements IClientManager{
	

	@Autowired
	IClientDao clientDAO;

	@Override
	public boolean create(Client client) {
		// TODO Auto-generated method stub
		clientDAO.create(client);
		return true;
	}

	@Override
	public boolean update(Client client) {
		// TODO Auto-generated method stub
		clientDAO.update(client);
		return true;
	}

	@Override
	public boolean delete(Client client) {
		// TODO Auto-generated method stub
		clientDAO.delete(client);
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
		return clientDAO.retrieveByCredentials(username, password);
	}
	

}
