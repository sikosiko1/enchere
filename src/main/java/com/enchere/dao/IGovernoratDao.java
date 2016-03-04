package com.enchere.dao;

import com.enchere.models.Governorat;

public interface IGovernoratDao {
	public boolean create(Governorat governorat);
	public boolean update(Governorat governorat);
	public boolean delete(Governorat governorat);
}
