package com.coder.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coder.spring.dao.UserRepository;
import com.coder.spring.entity.Users;

@Controller
@RequestMapping(path="/demo") //add main path to url.
public class MainController {

	//Inject the repository to controller class.
	@Autowired 
	private UserRepository userRepository;	
	
	//here we will get parameters from url and create new user.
	@GetMapping(path="/add")
	public @ResponseBody String addNewUser(@RequestParam String username, 
				@RequestParam String password, @RequestParam boolean status) {
		
		final Users theUser = new Users(username, password, status);
		userRepository.save(theUser);
		return "Saved";
	}
	
	//we will use @ResponseBody to return XML or JSON format to user.
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Users> getAllusers() {
		return userRepository.findAll();	
	}
	
}
