package com.enchere.dao;

import com.enchere.models.Voiture;

public interface IVoitureDao {
	public boolean create(Voiture vheicule);

	public boolean update(Voiture vheicule);

	public boolean delete(Voiture vheicule);
}
