package com.asif.userFront.dao;

import org.springframework.data.repository.CrudRepository;
import com.asif.userFront.domain.SavingsAccount;

public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long>{

	SavingsAccount findByAccountNumber (int accountNumber);
}
