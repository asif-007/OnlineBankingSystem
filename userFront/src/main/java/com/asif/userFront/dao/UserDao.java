package com.asif.userFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.asif.userFront.domain.User;

public interface UserDao extends CrudRepository<User, Long> {

	User findByUsername(String username);
	User findByEmail(String email);
}
