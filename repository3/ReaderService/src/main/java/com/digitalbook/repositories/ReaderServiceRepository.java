package com.digitalbook.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalbook.entities.Reader;


public interface ReaderServiceRepository extends JpaRepository<Reader, Integer> {
    //public List<Reader> findByEmail_Id(String email);

	public List<Reader> findByEmail(String email);
}
