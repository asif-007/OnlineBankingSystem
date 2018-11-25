package com.asif.userFront.dao;

import org.springframework.data.repository.CrudRepository;

import com.asif.userFront.domain.PrimaryAccount;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long>{
	
	PrimaryAccount findByAccountNumber (int accountNumber);
}
