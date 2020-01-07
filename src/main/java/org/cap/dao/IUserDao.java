package org.cap.dao;

import org.cap.entities.AppUser;

public interface IUserDao {
	public boolean credentialsCorrect(int id, String password);
	
	public AppUser findById(int id);

}
