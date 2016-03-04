package com.enchere.service;

import com.enchere.models.Bateau;

public interface IBateauManager {
	public boolean create(Bateau bateau);

	public boolean update(Bateau bateau);

	public boolean delete(Bateau bateau);
}
