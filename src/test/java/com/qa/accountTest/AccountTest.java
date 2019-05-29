package com.qa.accountTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.app.Account;
import com.qa.app.AccountRepositoryDB;
import com.qa.app.AccountRepositoryMap;

public class AccountTest {
	private Account account;

	@Before
	public void beforeTests() {
		account = new Account();
		account.setId(0);
		account.setFirstName("Chris");
		account.setLastName("Perrins");
		account.setAccountNumber(3);
	}

	@Test
	public void createAccountId() {
		int id = account.getId();
		assertEquals("Wrong id retrieved", 0, id);
	}

	@Test
	public void createAccountFirstName() {
		String firstName = account.getFirstName();
		assertEquals("Wrong first name retrieved", "Chris", firstName);
	}

	@Test
	public void createAccountLastName() {
		String lastName = account.getLastName();

		assertEquals("Wrong last name retrieved", "Perrins", lastName);
	}

	@Test
	public void createAccountNumber() {
		int accountNumber = account.getAccountNumber();
		assertEquals("Wrong account retrieved", 3, accountNumber);
	}
	@Test
	public void accountRepositoryMapTest() {
		AccountRepositoryMap arm = new AccountRepositoryMap();
		int id = 0;
		arm.add(account);
		Account retrieved = arm.retrieve(id);
		assertEquals("Wrong account retrived", "Chris", retrieved.getFirstName());
	}
	@Test
	public void accountRepositoryDBTest() {
		AccountRepositoryDB db = new AccountRepositoryDB();
		db.add(account);
		int id = account.getId();
		Account retrieved = db.retrieve(id);
		assertEquals("Wrong account retrived", account, retrieved);
	}

}
