package org.cap.service;

import org.cap.dao.IUserDao;
import org.cap.entities.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

	IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(IUserDao dao) {
		this.userDao = dao;
	}
	
	@Override
	public boolean credentialsCorrect(int id, String password) {
		boolean correct=userDao.credentialsCorrect(id,password);
		return correct;
	}
	
	@Override
	public AppUser findById(int id) {
		AppUser a=userDao.findById(id);
		return a;
	}

}
