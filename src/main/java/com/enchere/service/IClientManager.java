package com.enchere.service;

import java.util.List;

import com.enchere.Exceptions.BadCredentialException;
import com.enchere.models.Client;

public interface IClientManager {
	public boolean create(Client client);

	public boolean update(Client client);

	public boolean delete(Client client);
	public Client retrieveByLogin(String login);

	public List<Client> retrieveAll();

	public List<Client> findByname(String nom);

	public List<Client> findBylogin(String nom);

	public List<Client> findByEmail(String nom);

	public Client retrieveByCredentials(String username, String password)
			throws BadCredentialException;

}
