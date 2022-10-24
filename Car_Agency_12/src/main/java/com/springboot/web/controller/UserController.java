package com.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.entity.User;
import com.springboot.web.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService ;
	
	
	 @PostMapping("/user")
	    public User saveUser(@RequestBody User user) {
		 
	       return userService.saveUser(user);
	    }
}
