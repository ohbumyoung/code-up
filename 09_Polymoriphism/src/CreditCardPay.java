
// 상속관계 적용: extends
public class CreditCardPay extends PaymentMethod {
	//public(접근제한자) class CreditCardPay(자식 클래스) extends PaymentMethod(부모 클래스)
/*
 모든 클래스는 부모 클래스가 존재(모든 클래스는 Object 클래스로 부터 상속 받음)
 
 */
	
	//카드 결제 방식에서만 사용
	private String cardNumber;		//카드번호
	private int installment;		//할부개월수
	
	public CreditCardPay() {
		
	}
	
	
	public CreditCardPay(String payName,int payAmount, String cardNumber, int installment) {
		
		//this.payNaem = payName;
		//=> PaymentMethod 클래스에서 private으로 선언된 필드이기 때문에 접근 불가
		
		/* [1] setter 메소를 사용하여 부모 클래스로부터 물려받은 필으데 대입(저장)
		setPayName(payName);
		setPayAmount(payAmount);
		*/
		
		// [2] 부모 클래스의 생성자 사용(호출)
		super(payName, payAmount);  // 생성자를 호출할 때는 항상 첫 줄에 super(매개변수); 작성
		
		this.cardNumber = cardNumber;
		this.installment = installment;
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
		//System.out.println("결제 금액 : " + payAmount);  //payAmount private 이라 안되기 때문에
		System.out.println("결제 금액 : " + getPayAmount());// < getPayAmount()를 사용해야된다.
		
		System.out.println("카드 번호 : " + cardNumber);  //카드번호
		//System.out.println("할배 개월 수 : " + "installment");	 //할부개월수
		//할부 개월 수는 변동될 수 있다. 0일때는 "일시불" 출력 아니면 "개월" 출력
		System.out.println("할부 개월 수 : " + (installment == 0 ? "일시불" : installment + "개월"));
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
