package com.cybage.bookmanagement.controller;

//feature2
//feature3

import java.util.List;
import java.util.Map;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.cybage.bookmanagement.entity.Book;

import com.cybage.bookmanagement.service.BookServiceInterfaceDao;


/**this is a book controller which has methods 
 * like home,getAll,editBook,deleteBook,addbook,
 * save,Search which takes url mappings and 
 * binds the view pages using ModelAndView*/

@RestController
@RequestMapping("book")
@CrossOrigin(origins = "*",allowedHeaders="*")
public class BookController {
	
	
	@Autowired
	 private BookServiceInterfaceDao bookService;
	
	private static final Logger logger = LogManager.getLogger(BookController.class);
	
	
	/**This is a home page controller which has a dropdown search,
	 *  two urls for Add book and 
	 *  getting list of all  the books*/
	
	@RequestMapping("/home")
	public ModelAndView home() 
	{
	    
	    ModelAndView mav = new ModelAndView("index");
	    logger.info("On Index Page....home controller");
	    List<Book> bookList =bookService.getAll();
		mav.addObject("bookList", bookList);
		
		 return mav;
	    
	}
	
	
	/**This is a controller which executes on clicking list of books url
	 *  and returns all the list of books by 
	 *  using getAll method of book Service*/
	
	@GetMapping("/allbooks")
	public ModelAndView getAll()
	{
		 ModelAndView mav = new ModelAndView("allbooks");
		 List<Book> bookList =bookService.getAll();
		
	mav.addObject("bookList", bookList);
	
	logger.info("Getting all book List.....In getAll controller");
	 return mav;
	}
	
	
	
	/**this is a controller for method addbook of bookService
	 *  which takes Name,author,Publisher,Price
	 *   from the user input through jsp view and
	 *    binds it into book object  */
	
	@GetMapping("/addBook")
	public ModelAndView addBook(Map<String, Object> model) {
	    Book book = new Book();
	    model.put("book", book);
	    ModelAndView mav = new ModelAndView("addBook");
	    logger.info("Adding book....In addBook controller");
	    return mav;
	    
	    
	}
	
	
	
	/**this controller executes on clicking submit button of addBook jsp
	 *  and Editbook jsp,
	 *  it takes the new object and
	 *   saves it into the database*/
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveBook(@ModelAttribute(value="book") Book book) {
	
		try{
			bookService.save(book);
			
			return "Book Saved";
		}
		catch(Exception e){
			logger.info("Saving book...In save controller");
			return "Already existed";
		}
		
	}
	
	
	
	
	/**This controller executes on clicking jsp view editBook,
	 * it takes respective Book_id of the clicked book object 
	 * and edit the other fields like Name,Author,publisher
	 *  and sets the new fields of the Book object */
	
	@RequestMapping("/editBook")
    public ModelAndView editBook(@RequestParam  int Book_id) {
    	 Book book = bookService.get(Book_id);
    	 ModelAndView mav = new ModelAndView("editBook");
    	 mav.addObject("book", book);
    	 logger.info("Book to be edited.....In editBook controller");
        return mav;
    }
  

	
	
	@GetMapping("/test")
	public  String myFunction(){
		
		return "Ping";
		
	}
	

/**this controller calls a method search of book service and 
 * search a respective Book by taking a book name 
 * from the drop down from the view and returns
 *  the searched book further with giving options 
 *  to edit and delete the book*/
	
	@GetMapping("/search")
	 public ModelAndView search(@RequestParam String Name)
	{
		
			List<Book> bookList =bookService.search(Name);
			ModelAndView mav = new ModelAndView("search");
			 mav.addObject("bookList", bookList);
			 logger.info("Book to be searched.....In search controller");
			 return mav;
			 
		}
	
	
	
	/**This controller calls a method deleteBook of Book service
	 *  for deleting a particular book object clicked from the 
	 *  jsp view page by retrieving the object using Book_id */
	
	       @GetMapping("/deleteBook")
			public String deleteBook(@RequestParam  int Book_id)
	       {
	    	  	bookService.deleteBook(Book_id);
				logger.info("Book to be deleted.....In deleteBook controller");
				return "Book Deleted";
			}
	
		
}
//add book
//push remote
