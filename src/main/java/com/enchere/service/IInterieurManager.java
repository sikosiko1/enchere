package com.enchere.service;

import com.enchere.models.Interieur;

public interface IInterieurManager {
	public boolean create(Interieur interieur);

	public boolean update(Interieur interieur);

	public boolean delete(Interieur interieur);
}
