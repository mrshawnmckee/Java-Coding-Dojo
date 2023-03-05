package com.dojo.books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dojo.books.models.Book;
import com.dojo.books.services.BookServices;

@RestController
public class BooksApi {
	@Autowired
	private BookServices bookService;
	
//	private final BookServices bookService;
//	
//	public BooksApi(BookServices bookService) {
//		this.bookService = bookService;
//	}
//	
	@RequestMapping(value = "/api/books")
	public List<Book> index() {
		return bookService.allBooks();
	}
	
	//An error occurs on the new Book, so go to Book model and create a new constructor using fields(right click) >source>gen
	//Then give everything but created at and updated at, and place right after Book() constructor
	//Also, VERY IMPORTANT, these are the keys for input into the database(ex postman)s
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(
    		@RequestParam(value="title") String title, 
    		@RequestParam(value="description") String desc, 
    		@RequestParam(value="language") String lang, 
    		@RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }
    
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
    public Book update(
    		@PathVariable("id")Long id,
    		@RequestParam(value="title") String title, 
    		@RequestParam(value="description") String desc, 
    		@RequestParam(value="language") String lang, 
    		@RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        book.setId(id);
        Book updatedBook = bookService.updateBook(book);
        return updatedBook;
    }
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id")Long id) {
    	bookService.deleteBook(id);
    }
}
