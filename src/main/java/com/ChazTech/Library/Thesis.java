package com.ChazTech.Library;

import java.time.LocalDate;

public class Thesis extends Item {
	private String subject;
	private String author;
	Thesis(int idItem, String name, LocalDate publishedDate, String subject, String author) {
		super(idItem, name, publishedDate);
		this.subject = subject;
		this.author = author;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String getLoanTime() {
		return "1 month";
	}
	
}
