package com.enchere.service;

import com.enchere.models.TypeAnnonce;

public interface ITypeAnnonceManager {

	public boolean create(TypeAnnonce typeAnnonce);
	public boolean update(TypeAnnonce typeAnnonce);
	public boolean delete(TypeAnnonce typeAnnonce);
}
