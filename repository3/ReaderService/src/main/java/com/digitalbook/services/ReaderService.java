package com.digitalbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.digitalbook.entities.Reader;
import com.digitalbook.models.BookEntity;
import com.digitalbook.repositories.ReaderServiceRepository;




@Service
public class ReaderService {

   
    @Autowired
    private ReaderServiceRepository repo;
    
    public List<Reader> getAllReaders(){
        return repo.findAll();
    }
    public Reader saveReader(Reader reader){
        return repo.save(reader);
    }
    public Reader getReaderById(int reader_Id) {
		return repo.findById(reader_Id).orElse(null);

		//return repo.findById(reader_Id);
				
	}
    public List<Reader> getAllReaderss(){
        return repo.findAll();
    }
    /*public BookEntity getAllBooks(BookEnity book)
    {
    	return (BookEntity) repo.findAll();
    }*/
    
    
    
    public List<Reader> getReaderByEmail(String email)
    {
    	return repo.findByEmail(email);
    }
   /* @GetMapping("/findByEmail/{email}")
    public Manager findByEmail(@PathVariable String email){
        return managerRepository.findByEmail(email);
    };*/
    

    
}
