package com.enchere.dao;

import com.enchere.models.TypeAnnonce;

public interface ITypeAnnonceDao {
	public boolean create(TypeAnnonce typeAnnonce);
	public boolean update(TypeAnnonce typeAnnonce);
	public boolean delete(TypeAnnonce typeAnnonce);
}
