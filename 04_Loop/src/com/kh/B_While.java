package com.kh;

public class B_While {
	/*
	 while 문
	 [표현볍]
	 ------------------------
	 초기식;
	 	while(조건식) {
	 		//반복적으로 실행할 내용
	 		
	 		증감식;
	 	}
	 	------------------------
	 	=> while 문은 조건식 검사를 먼저 수행한 후 반복할 내용을 실행(조건식의 결과가 false 면 실행하지 않음)
	 	
	 	do ~ while 문
	 	[표현볍]
	 	------------------------
	 	초기식;
	 		do {
	 		//반복적으로 실행할 내용
	 	
	 		증감식;
	 		} while(조건식);
	 	-------------------------	
	 	=> do while 문은 무조건 한번 실행
	 	처음 조건식의 결과가 false 라면 최초 1회는 실행 후 종료
	 */

	public static void main(String[]args) {
		//조건을 만족하는경우
		//3 2 1 출력
		
		int n = 3;
		
		while(n > 0) {
			
			System.out.print(n + " ");
			n--;
		}
		
		System.out.println("\n----");
		
		int m = 3;
				do {
					System.out.print(m + " ");	
					
					m--;
					
				} while(m > 0);
				
				System.out.println("\n----");
				
				// 조건을 만족하지 않는 경우
				// while 문
				int n1 = 10;
				while(n1 < 5) {
					
					System.out.println("while 문 동작!");
				}
					System.out.println("*--- while 문 끝! ---*");
				
				// 조건을 만족하지 않는 경우
				// do ~ while 문
				int n2 = 10;
				do {
					System.out.println("do while 문 동작!");
					
					n2--;
					
				} while(n2 < 5);
				System.out.println("*--- do while 문 끝! ---*");
		
	}
}
