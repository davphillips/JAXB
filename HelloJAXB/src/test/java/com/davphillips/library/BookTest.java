package com.davphillips.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.SchemaFactory;

import org.junit.Test;
import org.xml.sax.SAXException;

public class BookTest {

	private Unmarshaller createNewUnmarshaller() throws JAXBException,
			SAXException, URISyntaxException {

		JAXBContext jc = JAXBContext.newInstance(Book.class);

		Unmarshaller unmarshaller = jc.createUnmarshaller();

		URL url = getClass().getClassLoader().getResource("book.xsd");

		unmarshaller.setSchema(SchemaFactory.newInstance(
				XMLConstants.W3C_XML_SCHEMA_NS_URI).newSchema(
				new File(url.toURI())));

		return unmarshaller;
	}

	private void printBook(Book b) {

		System.out.println("Title : " + b.getTitle());
		System.out.println("Author First Name : "
				+ b.getAuthorName().getFirstName());
		System.out.println("Author Middle Name : "
				+ b.getAuthorName().getMiddleName());
		System.out.println("Author Last Name : "
				+ b.getAuthorName().getLastName());
	}

	private void testBook(String xmlFilePath) throws JAXBException,
			FileNotFoundException, SAXException, URISyntaxException {

		Unmarshaller unmarshaller = this.createNewUnmarshaller();

		Book b = (Book) unmarshaller.unmarshal(getClass().getResourceAsStream(
				xmlFilePath));

		printBook(b);
	}

	@Test
	public void testValidBook1() throws JAXBException, FileNotFoundException,
			SAXException, URISyntaxException {

		this.testBook("/valid_book_1.xml");
	}

	@Test
	public void testValidBook2() throws JAXBException, FileNotFoundException,
			SAXException, URISyntaxException {

		this.testBook("/valid_book_2.xml");
	}

	@Test(expected = UnmarshalException.class)
	public void testInvalidBook1() throws JAXBException, FileNotFoundException,
			SAXException, URISyntaxException {

		this.testBook("/invalid_book_1.xml");
	}

	@Test(expected = UnmarshalException.class)
	public void testInvalidBook2() throws JAXBException, FileNotFoundException,
			SAXException, URISyntaxException {

		this.testBook("/invalid_book_2.xml");
	}

}
