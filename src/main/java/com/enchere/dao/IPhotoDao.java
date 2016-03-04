package com.enchere.dao;

import com.enchere.models.Photo;

public interface IPhotoDao {
	public boolean create(Photo photo);
	public boolean update(Photo photo);
	public boolean delete(Photo photo);
}
