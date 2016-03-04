package com.enchere.service;

import com.enchere.models.Governorat;

public interface IGovernoratManager {
	public boolean create(Governorat governorat);

	public boolean update(Governorat governorat);

	public boolean delete(Governorat governorat);
}
