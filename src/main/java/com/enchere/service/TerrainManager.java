package com.enchere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enchere.dao.ITerrainDao;
import com.enchere.models.Terrain;

@Service
public class TerrainManager implements ITerrainManager{
@Autowired
ITerrainDao ITerrainDAO;
	
	@Override
	public boolean create(Terrain terrain) {
		// TODO Auto-generated method stub
		ITerrainDAO.create(terrain);
		return true;
	}

	@Override
	public boolean update(Terrain terrain) {
		// TODO Auto-generated method stub
		ITerrainDAO.update(terrain);
		return true;
	}

	@Override
	public boolean delete(Terrain terrain) {
		// TODO Auto-generated method stub
		ITerrainDAO.delete(terrain);
		return true;
	}

}
