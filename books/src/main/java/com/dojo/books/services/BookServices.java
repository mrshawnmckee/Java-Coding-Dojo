package com.dojo.books.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.books.models.Book;
import com.dojo.books.repositories.BookRepository;

//Declares a class to be a service
@Service
public class BookServices {
	//this is dependency injection, not instantiating, because book  repository is an interface
//	private final BookRepository bookRepository;
//	
//	public BookServices(BookRepository bookRepository){
//	this.bookRepository = bookRepository;
//	}
	
	//Instead of the above(lines 16-20), we can just type:
	@Autowired
	private BookRepository bookRepository;
	
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    public Book updateBook(Book book) {
    	return bookRepository.save(book);
    }
    public void deleteBook(Long id) {
    	Optional<Book> optionalBook = bookRepository.findById(id);
    	if(optionalBook.isPresent()) {
    		bookRepository.deleteById(id);
    	}
    }
}

