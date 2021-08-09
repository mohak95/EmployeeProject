package com.java8.lambdaExample;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

	
	public List<Book> getBooks(){
		
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book(1, "Let us C", 240));
		books.add(new Book(2, "Core Java", 350));
		books.add(new Book(3, "J2EE", 500));
		
		return books;
		
		
	}

	@Override
	public String toString() {
		return "BookDao [getBooks()=" + getBooks() + "]";
	}

	
	
	
}
