package com.example.Nio4j.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Nio4j.Model.User;
import com.example.Nio4j.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public Collection<User> getAll() {

     return userRepository.getAllResource();
		
	}


}
