package com.blopapplication.blog.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blopapplication.blog.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
		
	
//	Optional<User> findByEmail(String email);
}