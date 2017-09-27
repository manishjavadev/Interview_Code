package com.manish.javadev.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DatabaseService {
	static Map<Integer, AccountEntity> accountMap = new HashMap<Integer, AccountEntity>();
	static {
		AccountEntity accountEntity = new AccountEntity(new Long(1), "saving Account", "Manish", new Double(2000),
				new Date());
		accountMap.put(1, accountEntity);
		accountEntity = new AccountEntity(new Long(2), "saving Account", "Manish", new Double(2000), new Date());
		accountMap.put(2, accountEntity);
		accountEntity = new AccountEntity(new Long(3), "saving Account", "Manish", new Double(2000), new Date());
		accountMap.put(3, accountEntity);
		accountEntity = new AccountEntity(new Long(4), "saving Account", "Manish", new Double(2000), new Date());
		accountMap.put(4, accountEntity);
		accountEntity = new AccountEntity(new Long(5), "saving Account", "Manish", new Double(2000), new Date());
		accountMap.put(5, accountEntity);
	}

	public static Map<Integer, AccountEntity> getAccountMap() {
		return accountMap;
	}

}
