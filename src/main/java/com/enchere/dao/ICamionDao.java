package com.enchere.dao;

import com.enchere.models.Camion;

public interface ICamionDao {

	
	
	public boolean create(Camion camion);
	public boolean update(Camion camion);
	public boolean delete(Camion camion);
}
