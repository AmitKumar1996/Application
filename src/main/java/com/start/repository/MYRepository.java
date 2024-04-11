package com.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.start.entity.User;

public interface MYRepository extends JpaRepository<User, Integer>{
	


}
