package com.enchere.service;

import com.enchere.models.Immoblier;

public interface IImmobilierManager {
	public boolean create(Immoblier immobilier);

	public boolean update(Immoblier immobilier);

	public boolean delete(Immoblier immobilier);
}
