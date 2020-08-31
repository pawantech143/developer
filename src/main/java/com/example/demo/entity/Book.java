package com.example.demo.entity;



import lombok.Data;

@Data

public class Book {
	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	private String authorName;
}
