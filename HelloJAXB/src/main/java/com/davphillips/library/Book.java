package com.davphillips.library;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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

	@XmlAttribute(name = "contentCategory", required = true)
	private BookContentCategory contentCategory;

	public Book() {
		super();
	}

	public Book(String title, AuthorName authorName,
			BookContentCategory contentCategory) {
		super();
		this.title = title;
		this.authorName = authorName;
		this.contentCategory = contentCategory;
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

	public BookContentCategory getContentCategory() {
		return contentCategory;
	}

	public void setContentCategory(BookContentCategory contentCategory) {
		this.contentCategory = contentCategory;
	}

}
