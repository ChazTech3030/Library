package com.ChazTech.Library;

import java.time.LocalDate;

public class Magazine extends Item {
	private String type;
	private String editor;
	Magazine(int idItem, String name, LocalDate publishedDate, String type, String editor) {
		super(idItem, name, publishedDate);
		this.type = type;
		this.editor = editor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	@Override
	public String getLoanTime() {
		return "2 weeks";
	}
}
