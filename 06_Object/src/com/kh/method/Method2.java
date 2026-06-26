package com.kh.method;

public class Method2 {
	/*
	 메소드 오버로딩
	 한 클래스 내에 같은 이름의 메소드를 여러개 사용할 수 있다. 
	 조건: 다른 매개변수의 타입, 순서, 갯수
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = add(20,7);
		System.out.print(result);
		
	}

	/**
	 add 메소드
	 : 두 정수의 합을 반환하는 메소드
	 
	 전달받아야 하는 값 => 두 정수(2개)
	 결과값 => 두 정수의 합(1)개
	 */
	public static int add(int n1, int n2) {
		
		return n1 + n2;
	}
	/*
	public static double add(int n1, int n2)
	오버로딩이 적용되지 않은 이유?
	:매개변수 정보 (갯수, 위치, 타입)가 같기 때문 
	반환형은 다르지만 아무 상관없다.
	*/
	
	
	public static double add(double n1, double n2) {
		return n1 + n2;
		
	}
		
	
}
