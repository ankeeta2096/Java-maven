package com.cybage.bookmanagement.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cybage.bookmanagement.entity.Book;






public interface BookRepository extends JpaRepository<Book, Integer> {
	
	@Query(value="select b from Book b ")
	public List<Book> getAll();   //Integer book_id
	
	@Query("select b from Book b where b.Name like :Name% and b.Name!=null ")
	public List<Book> search(@Param(value="Name") String Name );

	@Query("select b.Name from Book b")
	public List<Book> getName();
	
	
	


}


