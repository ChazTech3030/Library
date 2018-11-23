package com.ChazTech.Library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class LibraryStart {
	public void start() {
		LibraryStart libraryStart = new LibraryStart();
//		Book book = new Book(1,"theory of evolution", LocalDate.of(1990, 1, 1), "me", "science");
//		System.out.println(book.getLoanTime());
		try {
			libraryStart.loadLibraryFromFile("C:\\Users\\Admin\\Desktop\\JavaTraining\\Library\\src\\main\\resources\\Library.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadLibraryFromFile(String fileName) throws IOException {
		BufferedReader inF = new BufferedReader(new FileReader(fileName));
		String line;
		String[] lineData;
		while ((line = inF.readLine())!=null) {
			System.out.println(line);
			lineData = line.split(",");
			if (lineData[0].equals("Book")) {
				String[] dateData = lineData[3].split("-");
				System.out.println("" + dateData[0] + ":" + dateData[1] + ":" + dateData[2]);
				new Book(Integer.parseInt(lineData[1]),lineData[2],LocalDate.of(Integer.parseInt(dateData[0]), Integer.parseInt(dateData[1]), Integer.parseInt(dateData[2])),lineData[4],lineData[5]);
			}
			if (lineData[0].equals("Mag")) {
				String[] dateData = lineData[3].split("-");
				System.out.println("" + dateData[0] + ":" + dateData[1] + ":" + dateData[2]);
				new Magazine(Integer.parseInt(lineData[1]),lineData[2],LocalDate.of(Integer.parseInt(dateData[0]), Integer.parseInt(dateData[1]), Integer.parseInt(dateData[2])),lineData[4],lineData[5]);
			}
			if (lineData[0].equals("Thesis")) {				
				String[] dateData = lineData[3].split("-");
				System.out.println("" + dateData[0] + ":" + dateData[1] + ":" + dateData[2]);
				new Thesis(Integer.parseInt(lineData[1]),lineData[2],LocalDate.of(Integer.parseInt(dateData[0]), Integer.parseInt(dateData[1]), Integer.parseInt(dateData[2])),lineData[4],lineData[5]);
			}
		}
		inF.close();
		for (int i = 0; i < Item.libraryContents.size(); i++) {
			System.out.println("---");
			System.out.println(Item.libraryContents.get(i).getIdItem());
			System.out.println(Item.libraryContents.get(i).getName());
			System.out.println(Item.libraryContents.get(i).getPublishedDate());
			System.out.println(Item.libraryContents.get(i).getLoanTime());
			if (Item.libraryContents.get(i) instanceof Book) {
				Book book = (Book) Item.libraryContents.get(i);
				System.out.println(book.getGenre());
			}
		}
	}
	
	public boolean itemIsCheckedOut(int iD) {
		
		return true;
	}
	public void itemCheckIn(int iD) {
		
	}
	public void itemAddToLibrary(int id) {
		
	}
	public void itemRemoveFromLibrary(int id) {
		
	}
	public void itemUpdateInLibrary(int id) {
		
	}
	//
	// override
	//
	public void personRegister(String name, String address) {
		
	}
	public void personDelete(int iD) {
		
	}
	public void personUpdate(int iD){
		
	}
	//
	// override
	//
}
