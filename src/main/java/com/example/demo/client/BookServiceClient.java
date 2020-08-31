package com.example.demo.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Book;

@Service
public class BookServiceClient {

	public void saveBook() {

		String Url = "http://localhost:9090/save";
		Book book = new Book();
		book.setBookId(1);
		book.setBookName("spring");
		book.setBookPrice(3000.0);
		book.setAuthorName("road jonshon");

		RestTemplate t = new RestTemplate();
		ResponseEntity<Book> res = t.postForEntity(Url, book, Book.class);
		Book bookRes = res.getBody();
		System.out.println(bookRes);

	}
}
