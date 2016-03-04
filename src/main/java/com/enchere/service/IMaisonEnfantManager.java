package com.enchere.service;

import com.enchere.models.MaisonEnfant;

public interface IMaisonEnfantManager {
	public boolean create(MaisonEnfant maisonEnfant);

	public boolean update(MaisonEnfant maisonEnfant);

	public boolean delete(MaisonEnfant maisonEnfant);
}
