package com.asif.userFront.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.asif.userFront.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long>{

	List<PrimaryTransaction> findAll();
}
