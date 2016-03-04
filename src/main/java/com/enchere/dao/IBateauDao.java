package com.enchere.dao;

import com.enchere.models.Bateau;


public interface IBateauDao {

	public boolean create(Bateau bateau);
	public boolean update(Bateau bateau);
	public boolean delete(Bateau bateau);
}
