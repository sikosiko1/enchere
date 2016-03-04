package com.enchere.dao;

import com.enchere.models.Vehicule;

public interface IVehiculeDao {
	public boolean create(Vehicule vheicule);

	public boolean update(Vehicule vheicule);

	public boolean delete(Vehicule vheicule);
}
