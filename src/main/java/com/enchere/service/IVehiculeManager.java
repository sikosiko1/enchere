package com.enchere.service;

import com.enchere.models.Vehicule;

public interface IVehiculeManager {
	public boolean create(Vehicule vheicule);

	public boolean update(Vehicule vheicule);

	public boolean delete(Vehicule vheicule);
}
