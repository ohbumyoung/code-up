package com.kh.before;

//포인트 결제 방식
public class PointPay {
/*
 -payName:String
 -payAmount:int
 -myPoint:int
 -----------------
 +PointPay(payName:String, payAmount:int, myPoint:int)
 +getter/setter
+processpay():void
-------------------
 */
	private String payName; //결제명
	private int payAmount;  // 결제금액
	
	//포인트 결제 방식에서만 사용
	private int myPoint;    // 포인트점수
	
	public PointPay (String payName,int payAmount, int myPoint) {
		this.payName = payName;
		this.payAmount = payAmount;
		this.myPoint = myPoint;
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

	public int getMyPoint() {
		return myPoint;
	}

	public void setMyPoint(int myPoint) {
		this.myPoint = myPoint;
	}
	public void processpay() {
		System.out.println("==포인트 결제 정보===");
		System.out.println("결제 금액 : " + payAmount);  //결제금액
		System.out.println("포인트 점수 : " + myPoint);  //카드번호
		
		//결제 금액 < 포인트 잔액 => "결제 성공"
		// 			그렇지 않으면 => "결제실패"
		
		if(payAmount < myPoint) {
			System.out.println("결제 성공");
		}else {
			System.out.println("결제 실패");
		}
		// System.out.println((payAmount < myPoint) ? "결제성공" : "결제 실패");
		
	}
}
