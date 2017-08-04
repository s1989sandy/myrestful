package com.emc.rest.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emc.rest.model.Book;

@RestController
public class BookController {

	@RequestMapping(value="/book", method=RequestMethod.POST, 
									consumes={"application/json","application/xml"},
									produces={"application/json","application/xml"})
	public String addBook(@RequestBody Book book){
		System.out.println(book.getBookId());
		System.out.println(book.getBookName());
		System.out.println(book.getAuthorName());
		System.out.println(book.getAuthorMail());
		System.out.println(book.getCost());
		
		return "Success";
	}
}
