package com.enchere.service;

import com.enchere.models.Photo;

public interface IPhotoManager {

	public boolean create(Photo photo);

	public boolean update(Photo photo);

	public boolean delete(Photo photo);
}
