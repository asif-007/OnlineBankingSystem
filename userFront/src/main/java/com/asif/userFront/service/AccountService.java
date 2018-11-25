package com.asif.userFront.service;

import java.security.Principal;

import com.asif.userFront.domain.PrimaryAccount;
import com.asif.userFront.domain.SavingsAccount;


public interface AccountService {

	PrimaryAccount createPrimaryAccount();
	SavingsAccount createSavingsAccount();
	
	void deposit(String accountType, double amount, Principal principal);
	void withdraw(String accountType, double amount, Principal principal);
}
