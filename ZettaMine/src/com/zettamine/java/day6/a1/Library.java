package com.zettamine.java.day6.a1;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> bookList = new ArrayList<Book>();

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public void addBook(Book book) {
        bookList.add(book);
    }
	public boolean isEmpty() {
		return bookList.isEmpty();
	}
	public List<Book> viewAllBooks(){
		return bookList;
	}
	public ArrayList<Book> viewBooksByAuthor(String author){
		ArrayList<Book> result = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getBookAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
	}


	public int countNoOfBook(String bookName) {
		int count = 0;
        for (Book book : bookList) {
            if (book.getBookTitle().equalsIgnoreCase(bookName)) {
                count++;
            }
        }
        return count;
	}
}
