package org.cap.entities;

public class AppUser {
	private int id;
	private String name;
	private String password;

	public AppUser(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public AppUser() {}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		 if(obj==this) {
			 return true;
		 }
		 if(obj==null || !(obj instanceof AppUser)) {
			return false; 
		 }
		 
		 AppUser a=(AppUser)obj;
		 return a.id==this.id;

}
	
	@Override
	public int hashCode() {
		return id;
	}
}