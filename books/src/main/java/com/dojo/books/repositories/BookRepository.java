package com.dojo.books.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo.books.models.Book;



@Repository
//this will extend the crud repository and use the book model, and key type of long (of id)
public interface BookRepository extends CrudRepository<Book, Long>{
	List<Book> findAll();
	
}
