package com.manish.javadev.basic.test;

import java.util.List;

/**
 * @author Manish
 *
 */
public interface AccountService {
	AccountEntity createAccount(AccountEntity accountEntity);

	AccountEntity findAccount(Long accountNumber);

	List<AccountEntity> findAllAccounts();

	void deleteAccount(Long accountNumber);
}
