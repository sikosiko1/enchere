package com.enchere.dao;

import com.enchere.models.Terrain;

public interface ITerrainDao {
	public boolean create(Terrain terrain);
	public boolean update(Terrain terrain);
	public boolean delete(Terrain terrain);
}
