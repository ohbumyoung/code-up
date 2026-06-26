package com.kh.after;

//공통 되는 결제 정보를 관리하기 위한 클래스
// CreditCardPay와 PointPay의 공통되는것 :결제명(payName), 결제금액(payAmount), 결제정보 출력

public class PaymentMethod {
	
	private String payName;			
	private int payAmount; 	

	public PaymentMethod() {
		super(); //부모 클래스	생성자
	}
	
	public PaymentMethod (String payName,int payAmount) {
		super(); //부모 클래스	생성자
		this.payName = payName;
		this.payAmount = payAmount;
	}

	public String getPayName() {
		return payName;
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}

	public int getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(int payAmount) {
		this.payAmount = payAmount;
	}
	
	public void processpay() {
		System.out.println("=== 결제 정보===");
		System.out.println("결제명 : "+ payName);
		System.out.println("결제금액 : "  + payAmount);
	}
	
}
