package com.CRUD.CRUD.Operation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRUD.CRUD.Operation.Entity.User;
import com.CRUD.CRUD.Operation.Repository.UserRepo;

@Service
public class UserServiceImpl implements UserService1 {
	@Autowired
	UserRepo userRepo;

	@Override
	public User saveUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> displayUser() {

		return (List<User>) userRepo.findAll();
	}

	@Override
	public void deleteById(Integer UserId) {
		userRepo.deleteById(UserId);
	}

	@Override
	public User updateUser(User user, Integer UserId) {
		User u = userRepo.findById(UserId).get();
		u.setName(user.getName());
		u.setlName(user.getlName());
		u.setPhoneNo(user.getPhoneNo());
		u.setAdd(user.getAdd());
		u.setState(user.getState());
		u.setCountry(user.getCountry());

		return userRepo.save(u);
	}

}
