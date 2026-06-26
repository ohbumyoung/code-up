package com.kh.ex2;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("=== 신한은행 출금 시스템 ===");
		
		BankAccount ba = new BankAccount(10000);
		System.out.println("현재 잔액: " + ba.getBalanec());
		System.out.print("출금 시도 잔액: ");
		int amount = sc.nextInt();
		
		try {
		ba.withdraw(amount);
		} catch(NotEnoughBalanceException e) {
			System.out.println(e.getMessage());
			System.out.println("부족한 금액: " + e.getShortfallAmount());
		} finally {
			System.out.println("===거래가 종료되었습니다.===");
		}
		
		
	}

}
