package com.enchere.service;

import com.enchere.models.Appartement;

public interface IAppartementManager {
	public boolean create(Appartement appartement);

	public boolean update(Appartement appartement);

	public boolean delete(Appartement appartement);
}
