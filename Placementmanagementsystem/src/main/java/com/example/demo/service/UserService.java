package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.Userrepository;

@Service
public class UserService {
	
	@Autowired
	public Userrepository urepo;
	
	public User addUser(User user) {
	
		return urepo.save(user);
	
	}

}