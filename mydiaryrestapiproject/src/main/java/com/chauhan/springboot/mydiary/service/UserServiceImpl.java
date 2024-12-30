package com.chauhan.springboot.mydiary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chauhan.springboot.mydiary.entity.User;
import com.chauhan.springboot.mydiary.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUSer(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(User user) {
      userRepository.delete(user);
	}

	@Override
	public User findById(long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

}
