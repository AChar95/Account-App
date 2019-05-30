package com.qa.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String firstName;
	private String lastName;
	private int accountNumber;
	
	public Account() {
		
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	public int getId() {
		return this.id;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public int getAccountNumber() {
		return this.accountNumber;
	}
}
