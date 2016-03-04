package com.enchere.dao;

import com.enchere.models.MaisonEnfant;

public interface IMaisonEnfantDao {
	public boolean create(MaisonEnfant maisonEnfant);
	public boolean update(MaisonEnfant maisonEnfant);
	public boolean delete(MaisonEnfant maisonEnfant);
}
