package com.qa.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class AccountRepositoryDB implements AccountRepository {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void deleteAll() {
		et.begin();
		for (int i = 0; i < 100; i++) {
			Account account = retrieve(i);
			if (account != null) {
				delete(i);
			}
		}
		et.commit();
	}

	public void createwithTask(Account account) {
		et.begin();
		em.persist(account);
		et.commit();
	}

	public void add(Account account) {
		et.begin();
		em.persist(account);
		/*
		 * for (Task task : account.getTasks()) { em.persist(task); }
		 */
		et.commit();

	}

	public Account retrieve(int id) {
		return em.find(Account.class, id);

	}

	public List<Account> retrieveByName(String firstName) {
		/*
		 * TypedQuery<Account> q = em.createQuery("Select acc from Account acc",
		 * Account.class);
		 */
		TypedQuery<Account> q = em.createQuery("Select acc from Account acc where acc.firstName = '" + firstName + "'",
				Account.class);
		List<Account> accounts = q.getResultList();
		for (Account account : accounts) {
			System.out.println(account.getFirstName());
		}
		return accounts;
	}

	public Account updateFirstName(int id, String newFirstName) {
		et.begin();
		Account foundAccount = retrieve(id);
		foundAccount.setFirstName(newFirstName);
		et.commit();
		return foundAccount;
	}

	/*
	 * public void addTask(Set<Task> task) { et.begin(); em.persist(task);
	 * et.commit(); }
	 */
	public void delete(int id) {
		et.begin();
		Account deleteAccount = retrieve(id);
		em.remove(deleteAccount);
		et.commit();

	}

}
