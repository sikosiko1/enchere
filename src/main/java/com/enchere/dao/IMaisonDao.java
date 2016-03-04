package com.enchere.dao;

import com.enchere.models.Maison;

public interface IMaisonDao {
	public boolean create(Maison maison);
	public boolean update(Maison maison);
	public boolean delete(Maison maison);
}
