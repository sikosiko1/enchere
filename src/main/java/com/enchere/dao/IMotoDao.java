package com.enchere.dao;

import com.enchere.models.Moto;

public interface IMotoDao {
	public boolean create(Moto moto);
	public boolean update(Moto moto);
	public boolean delete(Moto moto);
}
