package com.enchere.service;

import com.enchere.models.Terrain;

public interface ITerrainManager {
	public boolean create(Terrain terrain);
	public boolean update(Terrain terrain);
	public boolean delete(Terrain terrain);
}
