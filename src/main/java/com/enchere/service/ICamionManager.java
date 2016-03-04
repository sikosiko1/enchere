package com.enchere.service;

import com.enchere.models.Camion;

public interface ICamionManager {

	public boolean create(Camion camion);

	public boolean update(Camion camion);

	public boolean delete(Camion camion);
}
