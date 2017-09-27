package com.manish.javadev.test;

import java.util.List;
import java.util.Map;

/**
 * @author Manish
 *
 */
public class AccountServiceImpl implements AccountService {

	public AccountEntity createAccount(AccountEntity accountEntity) {
		Map<Integer, AccountEntity> accountMap = DatabaseService.getAccountMap();
		accountMap.put(accountMap.size() + 1, accountEntity);
		return accountEntity;
	}

	public AccountEntity findAccount(Long accountNumber) {
		Map<Integer, AccountEntity> accountMap = DatabaseService.getAccountMap();
		return accountMap.get(accountNumber);
	}

	public List<AccountEntity> findAllAccounts() {
		Map<Integer, AccountEntity> accountMap = DatabaseService.getAccountMap();
		return (List<AccountEntity>) accountMap.values();
	}

	public void deleteAccount(Long accountNumber) {
		Map<Integer, AccountEntity> accountMap = DatabaseService.getAccountMap();
		accountMap.remove(accountNumber);
	}
}
