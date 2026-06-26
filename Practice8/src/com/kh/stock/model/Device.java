package com.kh.stock.model;

public class Device {
	
	protected String brand;
	protected String name;
	protected int price;
	
	public Device() {
		
	}
	
	public Device(String brand, String name, int price) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
	}

	public String getInformation() {
		
		// 원래 사용하던거 사용 가능
		
		return String.format("브랜드: %s, 제품명: %s, 가격: %d원", brand, name, price);
		// String.format (문자열형식, 사용할 값) => printf와 유사
		
	}


		
		
	
}
