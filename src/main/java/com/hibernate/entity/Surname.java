package com.hibernate.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Surname {
	private String lastName;

	public Surname() {
		super();
	}

	public Surname(String lastName) {
		super();
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
