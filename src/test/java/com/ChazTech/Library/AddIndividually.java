package com.ChazTech.Library;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.time.LocalDate;

public class AddIndividually {
	@Test
	public void newBook() {
		Book book = new Book(001,"On the Origin of Species",LocalDate.of(1850, 1, 1),"Charles Darwin","Science");
		assertEquals("Insert a new book", "Charles Darwin",book.getAuthor());
	}
	@Test
	public void newMag() {
		Magazine mag = new Magazine(007,"New Scientist",LocalDate.of(2018, 1, 1),"Science","Emily Wilson");
		assertEquals("Insert a new book", "Emily Wilson",mag.getEditor());
	}
	@Test
	public void newThesis() {
		Book book = new Book(001,"On the Origin of Species",LocalDate.of(1850, 1, 1),"Charles Darwin","Science");
		assertEquals("Insert a new book", "Charles Darwin",book.getAuthor());
	}
	@Test
	public void loadLibrary() {
		LibraryStart library = new LibraryStart();
		try {
			library.loadLibraryFromFile("C:\\Users\\Admin\\Desktop\\JavaTraining\\Library\\src\\main\\resources\\Library.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(Item.libraryContents.get(0));
		System.out.println(Item.libraryContents.toString());
		assertEquals("Load from library",1, Item.libraryContents.get(0).getIdItem());
	}
}
