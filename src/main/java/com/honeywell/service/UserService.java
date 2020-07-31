package com.honeywell.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honeywell.dao.EmployeeRepository;
import com.honeywell.dao.UserRepository;
import com.honeywell.exceptionhandler.BadRequestException;
import com.honeywell.model.Employee;
import com.honeywell.model.Gender;
import com.honeywell.model.User;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public void login(User emp) {

		
	}
	
	
	


}
