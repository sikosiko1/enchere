package com.enchere.service;

import com.enchere.models.Marque;

public interface IMarqueManager {
	public boolean create(Marque marque);

	public boolean update(Marque marque);

	public boolean delete(Marque marque);
}
