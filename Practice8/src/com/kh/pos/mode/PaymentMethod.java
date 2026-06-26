package com.kh.pos.mode;

public class PaymentMethod {
	
	protected String name;
	protected int minAge;
 	protected int transactionLimit;
 	
 	public PaymentMethod() {
 		super();
 	}
 	
 	public PaymentMethod(String name, int minAge, int transactionLimit) {
 		super();
 		this.name = name;
 		this.minAge = minAge;
 		this.transactionLimit = transactionLimit;
 		
 	}
 	
 	//Controller 에서 name의 값을 확인하기 위해 메소드 추가
 	public String getName() {
 		return name;
 	}
 	
 	//Controller 에서 minAge 값을 확인하기 위해 메소드 추가
 	public int getMinAge() {
 		return minAge;
 	}
 	
 	public String toString() {
 		return String.format("%s, 제한연령: %d세, 한도: %d원", name, minAge, transactionLimit);
 				
 		
 //플랫폼/카드명, 제한연령, 한도 정보를 문자열로 반환합니다. (자식 클래스에서 오버라이딩하여 사용)
 	}
 	
	
	}

