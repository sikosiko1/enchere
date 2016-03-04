package com.enchere.service;

import com.enchere.models.Maison;

public interface IMaisonManager {
	public boolean create(Maison maison);

	public boolean update(Maison maison);

	public boolean delete(Maison maison);
}
