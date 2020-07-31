package com.honeywell.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honeywell.dao.EmployeeRepository;
import com.honeywell.exceptionhandler.BadRequestException;
import com.honeywell.model.Employee;
import com.honeywell.model.Gender;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee createEmployee(Employee emp) {

		if(emp!=null)
		{
			return employeeRepository.save(emp);
		}
		else
		{
			throw new BadRequestException("Invalid employee data");
		}
	}
	
	
	
	
	public List<Employee> getEmployessByGenderAndAge(Gender gender, int minAge, int maxAge){
		
		return employeeRepository.findByGenderAndAgeBetween(gender,minAge,maxAge);
		
		
	}

}
