package com.asif.userFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.asif.userFront.domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
