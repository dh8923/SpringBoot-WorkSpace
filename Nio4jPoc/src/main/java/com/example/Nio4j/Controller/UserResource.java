package com.example.Nio4j.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Nio4j.Model.User;
import com.example.Nio4j.Service.UserService;

@RestController
@RequestMapping("user/neo4j")
public class UserResource {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public Collection<User> getAllResource()
	{
		return userService.getAll();
	}

}
