package com.kh.ex2;

import java.util.Scanner;

public class Quiz2 {
	
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("지불한 돈: " );
	
	int n1 = sc.nextInt();
		
	System.out.print("물건가격: " );
	
	int n2 = sc.nextInt();
	
	int result = n1 - n2; //거스름 돈 
	
	int result2 = result/1000; //천원짜리
	
	int result3 = result%1000/100;
	
	
	System.out.println("--- 거스름돈 내력 ---" );
	
	System.out.println("천원지폐: " + result2);
	
	System.out.print("백원동전: " + result3);
	

	

	
	

}
}

/*
**입력 예시**


지불한 돈 : 10000
물건 가격 : 6700


**출력 예시**


지불한 돈 : 10000
물건 가격 : 6700
--- 거스름돈 내역 ---
천원 지폐 : 3장
백원 동전 : 3개

 
*/
