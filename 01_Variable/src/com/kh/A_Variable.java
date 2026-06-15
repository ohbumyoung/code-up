package com.kh;

public class A_Variable {
	
	public static void main(String[]args) {
		//method1();
		method2();
	}
	
	public static void method2() {
		
		System.out.println("method2() start ....");
		
		// 1. 논리형 (boolean)  T/F 을 저장하는 자료형
		// is로 시작하는 변수이름
 		boolean isTrue = true;
		
		boolean isFalse = false;
		
		System.out.println("isTrue의 값 :" + isTrue);
		
		isFalse = -10 > 2 + 3;
		
		System.out.println("-10 > 2 + 3 의 결과 :" + isFalse);
		
		// 2. 숫자 (정수형, 실수형)
		// 2-1) 정수형: 딱 떨어지는 수
		// byte(1B), short(2B), int(4B), long(8B)
		
		// byte 자료형 변수 bNum을 선언하고 저장할 수 있는 범위 내의 최소값 대입(저장)
		byte bNum = -128;  //-128 ~ 127
		
		System.out.println("bNum 의 최소값:" + bNum);
		
		// 1000 값을 bNum에 저장할 수 있을까? => byte 범위를 넘어가기 때문에 오류가 일어난다
		
		long iNum = 1000l; // 뒤에 long의 앞글자 l를 넣으면 자료형을 long형태로 사용할 수 있다.
		
		//2-2 실수형: 소숫점 숫자
		// float(4B) / double (8B, 8byte)
		
		// float 자료형 변수 fNum에 0.0을 저장
		float fNum = 0.0f; //뒤에 float의 앞글자 f를 넣으면 자료형을 float형태로 사용할 수 있다.
		
		// double 자료형 변수 dNum에 0.0을 저장
		double dNum = 0.0;
		
		// 3. 문자형 (char, String)
		// 3-1 문자 : char (2B)
		
		// a 라는 값을 저장하는 변수 ch 선언
		
		char ch = 'a';
		
		// 3-2 문자열 : String(참조자료형)

		// 문자열 변수 str 선언 
		String str;
		
		// str 변수에 "안녕하세요 ~ " 저장 (대입, 할당)
		str = "안녕하세요~";
		
		// str 데이터의 길이 코드 : 변수명.length()
		System.out.print("str 데이터 길이: " + str.length());
		
		// 4. 상수 : 고정된 값, 변하지 않는 값을 저장하는 공간
		// final 자료형 변수명;
		
		// 최대 이용자 수를 저장하기 위한 상수 선언 : max users
		final int MAX_USERS;
		MAX_USERS = 24;
		
		// 재할당 불가, 이미 선언 했으면 끝
		
		
		
	}
	
	public static void method1() {
		
		System.out.println("홍길동 : " + 10520*8*5 + "원");
		
		System.out.println("아이유 : " + 10520*6*5 + "원");
		
		System.out.println("나루토 : " + 10520*10*3 + "원");
		
		System.out.println("짱구 : " + 10520*4*7 + "원");
		
		System.out.println("루피 : " + 10520*6*10 + "원");
		

		// 변수를 사용하여 시급에 대한 값을 관리해보자
		// 변수 선언 -> 자료형 변수명;
		
		int money = 10320;
		
		//System.out.println("홍길동 : " + 10520*6*10 + "원");
		System.out.println("홍길동 : " + money*8*5 + "원");
		
		//System.out.println("아이유 : " + 10520*6*10 + "원");
		System.out.println("아이유 : " + money*6*5 + "원");
		
		//System.out.println("나루토 : " + 10520*6*10 + "원");
		System.out.println("나루토 : " + money*10*3 + "원");
		
		//System.out.println("짱구 : " + 10520*6*10 + "원");
		System.out.println("짱구 : " + money*4*7 + "원");
		
		//System.out.println("루피 : " + 10520*6*10 + "원");
		System.out.println("루피 : " + 10520*6*10 + "원");
	}
}


	
 	