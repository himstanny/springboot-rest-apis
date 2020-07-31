package com.honeywell.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.honeywell.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	
//	User findByUsername(String userName);
	
}
