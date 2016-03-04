package com.enchere.dao;

import com.enchere.models.Immoblier;

public interface IImmobilierDao {
	public boolean create(Immoblier immobilier);
	public boolean update(Immoblier immobilier);
	public boolean delete(Immoblier immobilier);
}
