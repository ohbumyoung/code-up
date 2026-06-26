package com.kh.ex1.model.vo;

public class Product {
	
	private String productName;
	private int price;
	private String brand;
	
	public Product() {
		/*
		this.productName = productName; 
		this.brand = brand;
		this.price = price;
		*/
	}
	
	public String getProductName() {
		
		return this.productName;	
	}
	//값을 알고싶으면 set 메소드를 이용해서 전달하고 왜냐하면 productName이거는 private으로 감싸져 있으니깐
	// set: 해당 필드에 값을 저장하는 메소드
	public void setProductName(String productName) {
		this.productName = productName;
	}
	//get: 해당 필드의 값을 반환하는 메소드
	public int getPrice() {
		
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void information() {
		//갤럭시 / 10000 / "삼성"	형식으로 출력
		
		System.out.println(this.productName + "/" + this.price + "/" + this.brand);
		}
}
