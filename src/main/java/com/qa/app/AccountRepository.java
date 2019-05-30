package com.qa.app;

public interface AccountRepository {


	public abstract void add(Account account);
	public abstract Account retrieve(int id);
	public abstract Account updateFirstName(int id, String newFirstName);
	public abstract void delete(int id);

	
	public abstract void add(Account account);
	
	public abstract Account retrieve(int id);

	
}
