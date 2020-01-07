package org.cap.dao;

import java.util.HashMap;
import java.util.Map;

import org.cap.entities.*;

import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements IUserDao{
	private Map<Integer, AppUser> store=new HashMap<>();
	
	public UserDaoImpl() {
		AppUser user1=new AppUser(1,"Nandini","hi");
		store.put(1,user1);
		AppUser user2=new AppUser(2,"Nida","bye");
		store.put(2,user2);
	}
	
	@Override
	public boolean credentialsCorrect(int id, String password) {
        AppUser user = store.get(id);
        if (user == null) {
            return false;
        }
        return user.getPassword().equals(password);
    }
	
	@Override
	public AppUser findById(int id) {
		AppUser a=store.get(id);
		return a;
	}

}
