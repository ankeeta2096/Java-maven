package com.cybage.bookmanagement.service;

import java.util.List;

import com.cybage.bookmanagement.entity.Book;

public interface BookServiceInterfaceDao {
	
	
	
	
    public List<Book> getAll();

	public List<Book> search(String Name);
	
	
	public void deleteBook(int Book_id);

	


	public Book save(Book book);

public Book get(int Book_id);




	

}




