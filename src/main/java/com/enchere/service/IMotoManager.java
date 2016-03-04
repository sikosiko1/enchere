package com.enchere.service;

import com.enchere.models.Moto;

public interface IMotoManager {
	public boolean create(Moto moto);

	public boolean update(Moto moto);

	public boolean delete(Moto moto);
}
