package com.qa.app;

import java.util.HashMap;

public class AccountRepositoryMap implements AccountRepository{
	public HashMap<Integer, Account> maps = new HashMap<Integer, Account>();

	public void add(Account account) {
		maps.put(account.getId(), account);
	}
	
	public Account retrieve(int id) {
		
		return maps.get(id);
	}
}
