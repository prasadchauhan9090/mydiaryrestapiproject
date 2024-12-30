package com.chauhan.springboot.mydiary.service;

import java.util.List;

import com.chauhan.springboot.mydiary.entity.User;

public interface UserService {

	public User saveUser(User user);
	public User updateUSer(User user);
	public  void deleteUser(User user);
	public User findById(long id);
	public List<User> findAll();
	
	
}
