package com.springboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.entity.User;
import com.springboot.web.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		
		System.out.println(userRepository);
		System.out.println(user);
		return userRepository.save(user);
		
	}
}
