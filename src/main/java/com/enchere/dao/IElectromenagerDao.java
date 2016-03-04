package com.enchere.dao;

import com.enchere.models.Electromenager;

public interface IElectromenagerDao {

	public boolean create(Electromenager electromenager);

	public boolean update(Electromenager electromenager);

	public boolean delete(Electromenager electromenager);
}
