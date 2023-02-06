package com.CRUD.CRUD.Operation.Service;

import java.util.List;

import com.CRUD.CRUD.Operation.Entity.User;

public interface UserService1 {
	User saveUser(User user);
	List<User>displayUser();
	void deleteById(Integer UserId);
	User updateUser(User user,Integer UserId);
	
	

}
