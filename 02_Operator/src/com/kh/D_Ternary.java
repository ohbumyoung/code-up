package com.kh;

import java.util.Scanner;

public class D_Ternary {

	public static void main(String[] args) {
		
		mathood2();
		
	}

	public static void mathood1() {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 삼항연산자 (항이 3개인 연산자)
		 ____ ? ____ : ____
		 조건식 ? (조건식의 결과가 true인 경우 사용할 값) : (조선식의 결과가 false인 경우 사용할 값) 

		 */
		
		// 입력한 값이 x인 경우 "종료합니다." 출력 그렇지 않으면 "계속 진행합니다" 출력
		
		System.out.println("아무거나 입력하세요: ");
		
		String str = sc.next();
		
		char ch = str.charAt(0);
		
		String result = (ch == 'x' || ch == 'X') ? "종료합니다." : "계속 진행합니다";
		
		System.out.println(result);
		
		
		
		
	}
	
	public static void mathood2() {
		
		Scanner sc = new Scanner(System.in);
	
		/*
		 * 사용자에게 두 개의 정수와 + 또는 -를 입력받아 연산 결과를 출력
		 * 단, + 또는 - 외의 문자가 입력되었을 경우 "입력이 잘못되었습니다." 출력
		 * 
		 * 입력 예시)10 20 +
		 * 출력 예시)10 + 20 = 30
		 * 
		 * 입력 예시)5 10 /
		 * 출력 예시)5 / 10 = 입력이 잘못되었습니다.
		 */
	
		
		

		
		
		
		System.out.print("" + "");
		
		int n1 = sc.nextInt(); // 버퍼 : 10 20 +\n
		
		int n2 = sc.nextInt(); // 버퍼 : 20 +\n
		
		String strOp = sc.next(); //버퍼: +\n
		
		char op = strOp.charAt(0);
		
		String result = "" + ((op == '+') ? n1 + n2 : (op == '-') ? n1 - n2 : ("입력이 잘못되었습니다."));
		
		System.out.printf("%d %c %d = %s\n", n1, op, n2, result);
	
		
		
		
	}
	
}
