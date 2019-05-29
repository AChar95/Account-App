package com.qa.app;

public interface AccountRepository {

	public abstract void add(Account account);
	public abstract Account retrieve(int id);
}
