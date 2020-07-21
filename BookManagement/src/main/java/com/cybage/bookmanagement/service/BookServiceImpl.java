package com.cybage.bookmanagement.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.cybage.bookmanagement.entity.Book;
import com.cybage.bookmanagement.repository.BookRepository;


@Service
public class BookServiceImpl implements BookServiceInterfaceDao {
	@Autowired
	BookRepository bookRepo;
//Logging using Log4j
	private static final Logger logger = LogManager.getLogger(BookServiceImpl.class);

	
	/**Serach method calling method of bookRepo
	 *  by taking book name and 
	 *  returning Book list of that particular name*/
	
	@Override
	public List<Book> search(String Name)
	{
		System.out.println(Name);
		List<Book> bookList=bookRepo.search(Name);
		logger.info("In Search method of BookServiceImpl");
		return bookList;
		
		
	}

	
	
	/**getAll method of Bookservice calling findAll
	 *  method of Bookrepo to get the list of
all the book objects present in the database*/
	
	@Override
	public List<Book> getAll()
	{
		List<Book> bookList=bookRepo.findAll();
		 logger.info("In GetAll method of BookserviceImpl");
		 return bookList;

	}

	
	/**DeleteBook method takes BookId and find that
	 *  particular Book object by calling findOne method
	 *   of bookRepo and deletes that particular book object*/
	
	@Override
	public void deleteBook(int Book_id) {
		
		Book book=bookRepo.findOne(Book_id);
		bookRepo.delete(book);
		 logger.info("In DeleteBook method of BookServiceImpl ");

	}
	
	
	
	/**save method of bookservice saves the book
	 *  new object of addBook and
	 *   edited object of editBook*/
	
	@Override
	public Book save(Book book) {
		logger.info("In save method of BookServiceImpl");
		return bookRepo.save(book);
		
	}
	 

	@Override
	public Book get(int Book_id) {
		Book book= bookRepo.findOne(Book_id);
		return book;

	}








}