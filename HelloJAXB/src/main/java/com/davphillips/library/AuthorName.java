package com.davphillips.library;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "authorName", propOrder = { "firstName", "middleName",
		"lastName" })
@XmlAccessorType(value = XmlAccessType.FIELD)
public class AuthorName {

	@XmlElement(name = "firstName", required = true)
	private String firstName;

	@XmlElement(name = "middleName")
	private String middleName;

	@XmlElement(name = "lastName", required = true)
	private String lastName;

	public AuthorName() {
		super();
	}

	public AuthorName(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
