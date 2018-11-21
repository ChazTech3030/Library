package com.ChazTech.Library;

import java.time.LocalDate;
import java.util.ArrayList;

abstract public class Item {
	public int idItem;
	private String name;
	private LocalDate publishedDate;
	public static ArrayList<Item> libraryContents = new ArrayList<Item>();
	
	Item(int idItem, String name, LocalDate localDate) {
		this.idItem = idItem;
		this.name = name;
		this.publishedDate = localDate;
		Item.libraryContents.add(this);
	}

	abstract public String getLoanTime();
	
	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}
}
