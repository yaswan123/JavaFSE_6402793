package com.library.service;

import com.library.repository.BookRepository;

public class BookService{
private BookRepository bookRepository =  new BookRepository();
	
	public BookService() {
		super();
		System.out.println("Bean Created");
		bookRepository.display();
	}
}
