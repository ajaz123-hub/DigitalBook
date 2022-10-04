package com.digitalbook.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Reader {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reader_Id;
    private String name;
    private String email;
    private String password;
    private String date;
	public Reader() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reader(int reader_Id, String name, String email, String password, String date) {
		super();
		this.reader_Id = reader_Id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.date = date;
	}
	public int getReader_Id() {
		return reader_Id;
	}
	public void setReader_Id(int reader_Id) {
		this.reader_Id = reader_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Reader [reader_Id=" + reader_Id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", date=" + date + "]";
	}
	
}
