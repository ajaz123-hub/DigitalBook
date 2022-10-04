package com.digitalbook.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.digitalbook.clients.BookServiceClient;

import com.digitalbook.entities.Reader;
import com.digitalbook.models.BookEntity;
import com.digitalbook.services.ReaderService;




@RestController
@RequestMapping("/api/v1/digitalbooks/readers")
public class ReaderController {

	@Autowired
	private BookServiceClient bookServiceClient;
	@Autowired
	private ReaderService service;
	@PostMapping("/createreader")
	public Reader saveAuthor(@RequestBody Reader reader) {
		return service.saveReader(reader);
	}
	 
	
	@GetMapping("/readerById/{reader_Id}")
    public Reader findreaderById(@PathVariable int reader_Id) {
        return service.getReaderById(reader_Id);
    }
	/*@GetMapping("/searchbooks")
		public List<BookEntity> getAllBooks() {
			return bookServiceClient.getAllBooks();
		}*/
	 
	/* @GetMapping("/search")
		public List<Book> getBooks(@RequestParam  String category) {
			return bookServiceClient.getBooks(category);
		}*/
	 

		/*
		 * @GetMapping("/getBooks") public List<Show> getBooksFromBookService() {
		 * 
		 * return bookServiceClient.getBooks();
		 * 
		 * }
		 */
	
	@GetMapping("/readerByEmail/{email}/books")
    public List<Reader> findreaderByEmail(@PathVariable String email) {
        return service.getReaderByEmail(email);
    }
	
	@GetMapping("/reader/{email}/books") 
	 public BookEntity saveBook(@PathVariable String email,@RequestBody BookEntity book) {
		
		 return (BookEntity) bookServiceClient.getAllBooks(book); 
		 
	 }
	
	
}
