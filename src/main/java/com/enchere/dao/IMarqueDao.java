package com.enchere.dao;

import com.enchere.models.Marque;

public interface IMarqueDao {
	public boolean create(Marque marque);
	public boolean update(Marque marque);
	public boolean delete(Marque marque);
}
