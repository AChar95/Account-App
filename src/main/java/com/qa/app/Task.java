package com.qa.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String todo;

	public Task() {

	}

	public void setId(int id) {
		this.id = id;
	}

	public void setToDo(String todo) {
		this.todo = todo;
	}

	public int getId() {
		return this.id;
	}

	public String getToDo() {
		return this.todo;
	}

}
