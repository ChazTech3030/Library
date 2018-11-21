package com.ChazTech.Library;

import java.time.LocalDate;

public class Book extends Item{
	private String author;
	private String genre;
	Book(int idItem, String name, LocalDate localDate, String author, String genre) {
		super(idItem, name, localDate);
		this.author = author;
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String getLoanTime() {
		return "1 week";
	}
}
