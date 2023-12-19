package com.zettamine.java.stream.api;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LibraryOfBooks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Search book by name: ");
		//String str = sc.next();
		List<Books> books = new BookDao().getBookDetails();
		
//		List<Books> collect = books.stream().filter(st-> st.getAuthor().equalsIgnoreCase(str)).collect(Collectors.toList());
//		collect.forEach(n-> System.out.println(n));
//		int id=87376;
//		Optional<Books> opt = books.stream().filter(st-> st.getBookId()==id).skip(1).findFirst().or(new LibraryOfBooks()::isEmptyLibrary);
//		if (opt.isPresent()) {
//			
//		}
		 books.stream().map(n-> n.getBookId()+1).skip(0).collect(Collectors.toList()).forEach(n-> System.out.println(n));
	}
	public Optional<Books> isEmptyLibrary()
	{
		return Optional.of(new Books());
	}
}
