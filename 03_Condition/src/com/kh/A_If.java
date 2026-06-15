package com.kh;

import java.util.Scanner;

public class A_If {
	
	/*
	 기본적으로 프로그램은 순차적으로 실행(위 -> 아래, 왼쪽 -> 오른쪽)
	 순차적인 흐름을 바꿀 때 "제어문"을 사용하여 처리 가능
	 * 
	 * 조건문 if
	 [1] 단독 if문
	 if(조건식) {
	 조건식의 결과가 true일 때 실행할 내용
	 }
	 
	 [2] if ~ else 문
	 if(조건식) {
	 조건식의 결과가 true일 때 실행할 내용
	 }
	 
	 else {조건식의 결과가 false 일 때 실행할 내용
	 }
	 
	 [3] if ~ else if ~ else 문
	 if(조건식1) {
	 조건식1의 결과가 true일 때 실행할 내용
	 }
	 
	 else if (조건식2) {
	 조선식의1의 결과가 false 조건식2가 true일 때 실행할 내용
	 }
	 
	 else {조건식1,2 의 결과가 false 일 때 실행할 내용
	 }
	 */

	public static void main(String[] args) {
		
		mathood1();
		
	}
	
	public static void mathood1() {
		
		Scanner sc = new Scanner(System.in);
		
				
		/* 입력받은 값이 1 ~ 10 사이의 값이면 해당 값을 출력 
		 그렇지 않으면 "범위를 벗어났습니다." 출력
		 */
	
		System.out.print("입력 값: ");
		
		int num = sc.nextInt();
		
	    if(num >= 1 && num <= 10) {
	    
	    System.out.println(num);
	    } else {
	    	System.out.println("범위를 벗어났습니다.");
	    }
	sc.close();
	
	}
}
	    
		
		
		
		


