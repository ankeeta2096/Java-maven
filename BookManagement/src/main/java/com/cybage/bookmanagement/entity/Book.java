package com.cybage.bookmanagement.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Entity
@Table(name = "Books",uniqueConstraints = { @UniqueConstraint(columnNames = 
{ "Name", "Author","Publisher" }) })
public class Book 
 {
	
	@Id
	@Column(name = "Book_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Book_id;
	
	
	
	@Column(name = "Name",nullable = false)
	private String Name;

	@Column(name = "Author",nullable = false)
	private String Author;

	@Column(name = "Publisher",nullable = false)
	private String Publisher;
	
	@Column(name = "Price",nullable = false)
	private int Price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer book_id, String name, String author, String publisher, int price) {
		super();
		Book_id = book_id;
	
		Name = name;
		Author = author;
		Publisher = publisher;
		Price = price;
	}

	public Integer getBook_id() {
		return Book_id;
	}

	public void setBook_id(Integer book_id) {
		Book_id = book_id;
	}

	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Book [Book_id=" + Book_id + ", Name=" + Name + ", Author=" + Author
				+ ", Publisher=" + Publisher + ", Price=" + Price + "]";
	}

	public boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}

	

}

