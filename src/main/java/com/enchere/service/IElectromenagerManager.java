package com.enchere.service;

import com.enchere.models.Electromenager;

public interface IElectromenagerManager {
	public boolean create(Electromenager electromenager);

	public boolean update(Electromenager electromenager);

	public boolean delete(Electromenager electromenager);
}
