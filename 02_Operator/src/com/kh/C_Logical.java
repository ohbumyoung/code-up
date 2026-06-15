package com.kh;

import java.util.Scanner;

public class C_Logical {

	/*
	 * 논리 연산자 (이항 연산자)
	 두개의 논리 값을 연산(true/false)
	 결과 값은 또한 true/false
	 
	 종류:&&(and), ||(or)
	 A && B = A,B 둘다 true 일 때만 true
	 A || B = A,B 둘 중 하나만 true 여도 true
	 
	 SCE(단축평가)
	 앞의 조건만으로 결과가 확실할 때 뒤의 식을 아예 계산X
	 &&연산자: 앞의 조건이 false 라면 뒤에 조건은 실행되지 않는다. 
	 ||연산자: 앞의 조건이 true 라면 뒤에 조건은 실행되지 않는다.
	 
	 */

	public static void main(String[] args) {
		
		mathood2();

		
	}

	public static void mathood1() {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력받은 값이 1 ~ 10 사이의 값인지 확인
		
		System.out.print("정수를 입력하세요: ");
		
		int num = sc.nextInt();
		
		// true 또는 false 로 결과 출력
		
		boolean result = (num >= 1) && (num <=10);
		
				
		System.out.println("입력된 값은 1 ~ 10 사이의 값인가? " + (result));	
		
		boolean result2 = (num<1) || (num>10);
		
		
		System.out.println("입력된 값은 1 ~ 10 범위를 벗어나는가? " + (result2));
		
		
		
	}
	
	public static void mathood2() {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력받은 문자가 소문자인지 확인
		// 'a' : 97, 'z':122
		
		
		System.out.println("입력받을 문자: ");
		
		String str = sc.next(); // "" 문자를 숫자로 변환하는 코딩
		
		char ch = str.charAt(0); // ""문장의 0번 째를 가져온다
		
		boolean result = ch >= 97 && ch<= 122; // 조건식
		
		boolean result2 = ch >= 'a' && ch<= 'z'; // 조건식
		
		System.out.println("입력받은 값이 소문자인가?: " + result);
		System.out.println("입력받은 값이 소문자인가?: " + result2);
		
		
		
		
		
		
	}
	
	
}
