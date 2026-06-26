package com.kh.before;
// 카드 결제 방식
public class CreditCardPay {
/*
 -payName: String?
 -payAmount:int
 -cardNumber:String
 -installment:int
 -----------------
 +CreditCardPay(payName:String, payAmount:int, cardNumber:String, installment:int) 
 +getter/setter
 +processpay():void
 --------------------
 
 */
	
	private String payName;			//결제명
	private int payAmount; 			//결제 금액
	
	//카드 결제 방식에서만 사용
	private String cardNumber;		//카드번호
	private int installment;		//할부개월수
	
	
	public CreditCardPay(String payName,int payAmount, String cardNumber, int installment) {
		this.payName = payName;
		this.payAmount = payAmount;
		this.cardNumber = cardNumber;
		this.installment = installment;
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

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getInstallment() {
		return installment;
	}

	public void setInstallment(int installment) {
		this.installment = installment;
	}

	public void processpay() {
		System.out.println("==카드 결제 정보===");
		System.out.println("결제 금액 : " + payAmount);  //결제금액
		System.out.println("카드 번호 : " + cardNumber);  //카드번호
		//System.out.println("할배 개월 수 : " + "installment");	 //할부개월수
		//할부 개월 수는 변동될 수 있다. 0일때는 "일시불" 출력 아니면 "개월" 출력
		System.out.println("할배 개월 수 : " + (installment == 0 ? "일시불" : installment + "개월"));
		/*
		 조건식 활용해보기
		 if(installment == 0) {
		 System.out.println("일시불");
		 } else {
		 System.out.println("개월")
		 }
		 */
	}
	
}
