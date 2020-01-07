package org.cap.service;

import org.cap.entities.AppUser;

public interface IUserService {
	public boolean credentialsCorrect(int id, String password);
	
	public AppUser findById(int id);

}
