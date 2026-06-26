package com.kh.ex2;

public class BankAccount {
	
	

	private int balanec;
	
	public BankAccount(int initialBalanec) {
		this.balanec = initialBalanec;
	}
	
	public int getBalanec() {
		return balanec;
	}
	
	
	/**
	 * 출금 기능. 현재 잔액에서 전달받은 금액(amount) 차감
	 * @param amount 출금 금액
	 */
	public void withdraw(int amount) throws NotEnoughBalanceException {
		// balance = balance - amount;
		if (balanec < amount) {
			// 예외 발생 시키기!!!
			throw new NotEnoughBalanceException("[출금 오류 발생] 잔액이 부족합니다.", balanec, amount);
		}
		
		
		balanec -= amount;
		System.out.println("출금 완료! 남은 잔액: " + balanec +"원");
	}

}

