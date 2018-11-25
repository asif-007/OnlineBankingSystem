package com.asif.userFront.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.asif.userFront.domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

	List<SavingsTransaction> findAll();
}
