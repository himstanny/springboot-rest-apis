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
import com.honeywell.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employee")
	public ResponseEntity<?> createEmployee(@RequestBody Employee emp) {

		return ResponseEntity.ok(employeeService.createEmployee(emp));
	}
	
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>>  createEmployee(@RequestParam("gender") Gender gender,
			@RequestParam("minage") int minAge,@RequestParam("maxage") int maxAge) {
		
		return new ResponseEntity<List<Employee>>(employeeService.getEmployessByGenderAndAge(gender, minAge, maxAge), HttpStatus.OK);
		

		
	}

}
