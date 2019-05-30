package com.qa.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AccountRepositoryDB implements AccountRepository{
EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
EntityManager em = emf.createEntityManager();
EntityTransaction et = em.getTransaction();

	public void add(Account account) {
		et.begin();
		em.persist(account);
		et.commit();
		
	}

	public Account retrieve(int id) {
		return em.find(Account.class, id);
		
	}
	public Account updateFirstName(int id, String newFirstName) {
		et.begin();
		Account foundAccount = retrieve(id);
		foundAccount.setFirstName(newFirstName);
		et.commit();
		return foundAccount;
		
		
	}
	public void delete(int id) {
		et.begin();
		Account deleteAccount = retrieve(id);
		em.remove(deleteAccount);
		et.commit();
		
	}

}
