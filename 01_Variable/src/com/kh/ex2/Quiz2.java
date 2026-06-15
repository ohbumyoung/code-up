package com.kh.ex2;

public class Quiz2 {
	
	public static void main(String[]args) {
				
		int a = 10;
		
		int b = 20;
		
		System.out.println("교환 전: a = 10, b = 20");
		
				// a의 값과 b의 값을 교환
		
		// 기존 a에 들어있던 10 을 다른 변수에 넣어준다.

		int x = a; // 그 변수를 x로 지정
	
		a = b; // 비어 있는 a에 b를 대입
		
		b = x; // a에 있던 10을 변수에 넣었으니 그 변수에 있는 숫자를 b에 대입
		 
		System.out.print("교환 후: a = 20, b = 10");
				
	}
	
			

}
