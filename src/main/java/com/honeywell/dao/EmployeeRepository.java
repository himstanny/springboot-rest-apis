package com.honeywell.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.honeywell.model.Employee;
import com.honeywell.model.Gender;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	 List<Employee> findByGenderAndAgeBetween(Gender gender, int minAge, int MaxAge);

}
