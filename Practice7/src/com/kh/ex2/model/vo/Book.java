package com.kh.ex2.model.vo;

public class Book {
	
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {
		
	}
	//매개 변수가 3개인 생성자
	public Book(String title, String publisher,String author) {
		
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	//매개 변수가 5개인 생성자
	public Book(String title, String publisher,String author, int price, double discountRate) {
		
		this.title = title;
		this.publisher =publisher;
		this.author = author;
		 // => this(title, publisher, author) 랑 같은 의미의 코드
		
		this.price = price;
		this.discountRate = discountRate;
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public void inform() {
		System.out.printf("%s %s %s %d %.2f\n",title, author, publisher, price, discountRate);
	}
	
}
