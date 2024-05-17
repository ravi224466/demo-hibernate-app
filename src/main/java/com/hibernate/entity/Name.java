package com.hibernate.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class Name {
	private String firstName;

	private String middleName;

	//@Parent
	@Embedded
	private Surname surname;

	public Name() {

	}

	public Name(String firstName, String middleName, Surname lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.surname = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Surname getSurname() {
		return surname;
	}

	public void setSurname(Surname surname) {
		this.surname = surname;
	}
	
	

}