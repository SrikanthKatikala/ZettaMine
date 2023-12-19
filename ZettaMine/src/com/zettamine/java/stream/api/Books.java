package com.zettamine.java.stream.api;

import java.util.ArrayList;
import java.util.List;

public class Books {
	
	private int bookId;
	private String author;
	private String bName;
	public Books() {
		
	}
	public Books(int bookId, String author, String bName) {
		super();
		this.bookId = bookId;
		this.author = author;
		this.bName = bName;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	@Override
	public String toString() {
		return String.format("Book [%3d | %-12s | %-10s]", bookId, author, bName);
	}
	
}
