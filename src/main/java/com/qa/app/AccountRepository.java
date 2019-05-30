package com.qa.app;

public interface AccountRepository {

	public abstract void add(Account account);
	public abstract Account retrieve(int id);
	public Account updateFirstName(int id, String newFirstName);
	public void delete(int id);
	
}
