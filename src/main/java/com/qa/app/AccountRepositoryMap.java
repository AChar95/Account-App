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

	public Account updateFirstName(int id, String newFirstName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
}
