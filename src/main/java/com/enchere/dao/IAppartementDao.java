package com.enchere.dao;


import com.enchere.models.Appartement;

public interface IAppartementDao {

	
	public boolean create(Appartement appartement);
	public boolean update(Appartement appartement);
	public boolean delete(Appartement appartement);
}
