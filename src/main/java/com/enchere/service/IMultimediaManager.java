package com.enchere.service;

import com.enchere.models.Multimedia;

public interface IMultimediaManager {
	public boolean create(Multimedia multimedia);
	public boolean update(Multimedia multimedia);
	public boolean delete(Multimedia multimedia);
}
