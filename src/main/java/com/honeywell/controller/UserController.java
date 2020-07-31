package com.honeywell.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.model.Employee;
import com.honeywell.model.Gender;
import com.honeywell.model.User;
import com.honeywell.service.EmployeeService;
import com.honeywell.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public String login (@RequestBody User user) {
		
		

		//User myuser = new User(user.getUsername(),user.getPassword());
		
		return "User logged in succeessfully.I have used in memory users for so please use these credentials for authentication(username:admin, password:admin)";
		
	}
	

}
