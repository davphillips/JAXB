package com.davphillips.library;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "book")
@XmlType(propOrder = { "title", "authorName" })
@XmlAccessorType(value = XmlAccessType.FIELD)
public class Book {

	@XmlElement(name = "title", required = true)
	private String title;

	@XmlElement(name = "authorName", required = true)
	private AuthorName authorName;

	public Book() {
		super();
	}

	public Book(AuthorName authorName) {
		super();
		this.authorName = authorName;
	}

	public AuthorName getAuthorName() {
		return authorName;
	}

	public void setAuthorName(AuthorName authorName) {
		this.authorName = authorName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
