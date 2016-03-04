package com.enchere.dao;

import com.enchere.models.Interieur;

public interface IInterieurDao {
	public boolean create(Interieur interieur);
	public boolean update(Interieur interieur);
	public boolean delete(Interieur interieur);
}
