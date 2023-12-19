package com.zettamine.java.stream.api;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public  List<Books> getBookDetails(){
		List<Books> books = new ArrayList<Books>();
		books.add(new Books(3457, "Rinku", "java"));
		books.add(new Books(8347, "Rinku", "mechanics"));
		books.add(new Books(8732, "Samurai", "python"));
		books.add(new Books(7236, "sanchi", "c"));
		books.add(new Books(6182, "Dev", "c++"));
		return books;
		
	}
}
