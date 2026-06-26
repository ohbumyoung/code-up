package com.kh.after;
/*
 [1] 공통 부분 제거
 [2] 상속 관계 적용
 [3] getter, setter, 생성자 등을 활용해서 원래 기능이 동작되도록 처리
 */

public class PointPay extends PaymentMethod {
	
	private int myPoint;    // 포인트점수
	
	public PointPay (String payName,int payAmount, int myPoint) {
		super(payName, payAmount);
		this.myPoint = myPoint;
	}



	public int getMyPoint() {
		return myPoint;
	}

	public void setMyPoint(int myPoint) {
		this.myPoint = myPoint;
	}
	
	
	/* 오버라이딩으로 인해 없어도 가능 
	public void processpay() {
		System.out.println("==포인트 결제 정보===");
		System.out.println("결제 금액 : " + getPayAmount());  //결제금액
		System.out.println("포인트 점수 : " + myPoint);  //카드번호
		
		System.out.println((getPayAmount() < myPoint) ? "결제성공" : "결제 실패");
	*/


// @Override: 오버라이딩 된 메소드를 명시적으로 표시, 컴파일 단계에서 잘못 작성했을 경우 오류를 알려줌
	@Override  
	public String getPayName() {
		// TODO Auto-generated method stub
		return super.getPayName();
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}



	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}



	@Override
	public void setPayName(String payName) {
		// TODO Auto-generated method stub
		super.setPayName(payName);
	}



	@Override
	public int getPayAmount() {
		// TODO Auto-generated method stub
		return super.getPayAmount();
	}



	@Override
	public void setPayAmount(int payAmount) {
		// TODO Auto-generated method stub
		super.setPayAmount(payAmount);
	}



	@Override
	public void processpay() {
		// TODO Auto-generated method stub
		super.processpay();
		
		System.out.println((getPayAmount() < myPoint) ? "결제성공" : "결제 실패");
	}
	
	
		
		
	}

