package com.dojo.books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dojo.books.models.Book;
import com.dojo.books.services.BookServices;

@Controller
public class BookController {
	
	@Autowired //This is to take care of the dependency injection
	BookServices bookService;
//	@GetMapping("/books/{bookId}")
////	@PathVariable is to link the BookId variable with a path, and then the type
//	public String index(Model model, @PathVariable("bookId")Long bookId) {
//		
////		This is calling the findBook from services and Book from the model
//		Book book = bookService.findBook(bookId);
//		
//		//Whatever is in parenthesis and "" is what the JSP page must call it
//		model.addAttribute("book", book);
//		
// 
//
//		return "index.jsp";
//	}
	@GetMapping("/books")
	public String index(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return "index.jsp";
	}
	
}	

