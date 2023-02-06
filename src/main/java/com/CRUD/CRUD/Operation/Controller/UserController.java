package com.CRUD.CRUD.Operation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.CRUD.Operation.Entity.User;
import com.CRUD.CRUD.Operation.Service.UserService1;


@RestController
public class UserController {
	@Autowired
	UserService1 userservice;
	
	@PostMapping("/User")
	public User saveuser(@RequestBody User user) {
		return userservice.saveUser(user);
	}
	
	@GetMapping("/User")
	public List<User> displayUser(User user,Integer uid){
		return userservice.displayUser();
	}
	
	@DeleteMapping("/User/{id}")
	public String deleteById(@PathVariable("id")Integer uid ) {
		userservice.deleteById(uid);
		return"Delete sucessfully";
	}
	@PutMapping("/User/{id}")
	public User updateUser(@RequestBody User user,@PathVariable("id") Integer uid) {
	return userservice.updateUser(user, uid);	
	}
}

