package com.kh.ex2;

public class NotEnoughBalanceException extends Exception {

	private int balance;
	private int withdrawalAmount;
	
	public NotEnoughBalanceException(String message, int balance, int withdrawalAmount) {
		//message, balance, withdrawalAmount 3개를 전달 받는다
		super(message);
		this.balance = balance;
		this.withdrawalAmount = withdrawalAmount;
	}
	
	//부족한 금액을 반환하는 메소드
	public int getShortfallAmount() {
		return withdrawalAmount - balance ;
	}
	

	public int getBalance() {
		return balance;
	}

	
}
