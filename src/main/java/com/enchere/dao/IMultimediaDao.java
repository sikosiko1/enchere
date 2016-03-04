package com.enchere.dao;

import com.enchere.models.Multimedia;

public interface IMultimediaDao {
	public boolean create(Multimedia multimedia);
	public boolean update(Multimedia multimedia);
	public boolean delete(Multimedia multimedia);
}
