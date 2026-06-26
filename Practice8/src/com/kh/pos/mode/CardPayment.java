package com.kh.pos.mode;

public class CardPayment extends PaymentMethod {
	private boolean hasCashback;
	
	public CardPayment() {
		
	}
	
	public CardPayment(String name, int minAge, int transactionLimit, boolean hasCashback) {
		super(name, minAge, transactionLimit);
		this.hasCashback = hasCashback;
		
	}
	
	// hasCashback getter 메소드 => Controller 작업 중 추가
	// boolean 타입은 get 말고 i(필드명)으로 만들어진
	public boolean isHasCashback() {
		return hasCashback;
	}
	
	public String toString() {
		//return super.toString();
		return String.format("신용/체크카드 - 카드명: %s | 캐시백 여부: %s", super.toString(), 
		hasCashback ? "캐시백 가능" : "캐시백 없음");
	}
}
