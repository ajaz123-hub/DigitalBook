package com.digitalbook.clients;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.digitalbook.models.BookEntity;

import feign.Headers;

@FeignClient(name="bookservice",url="localhost:8081")
public interface BookServiceClient {
	
	
	
	@GetMapping("/api/v1/digitalbooks/books")
	List<BookEntity> getAllBooks(BookEntity book);

	//ookEntity SaveBook(BookEntity book);

	//BookEntity getAllReaders(BookEntity book);
	
	/*@GetMapping("/api/v1/digitalbooks/books/searchbybooks")
	List<Book> getBooks(@RequestParam  String category);*/
}
