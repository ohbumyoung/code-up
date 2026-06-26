package com.kh;

public class D_Wrapper {
	/*
	 Wrapper 클래스: 기본 자료형을 객체화 해주는 클래스
	 
	 bollean   ---> Bollean
	 char      ---> Character
	 byte      ---> Byte
	 short     ---> Short
	 int       ---> Integer
	 long      ---> Long
	 double    ---> Double
	 float     ---> Float
	 
	 기본 자료형을 객체화해야 하는 이유?
	 - 다형성을 적용시키고 싶을 때 
	 - 매개변수로 기본자료형이 아닌 객체 타입만 요구될 때
	 - 제네릭을 적용시키고 싶을 때
	 */

	public static void main(String[] args) {
		
		// Boxing: 기본 자료형을 Wrapper 클래스로
		int n1 = 100;
		int n2 = 200;
		
		//기본 자료형은 equals 사용 불가! ->  Wrapper 클래스로 변환하여 사용
		Integer i1 = Integer.valueOf(n1);
		Integer i2 = n2;
		
		System.out.println(i1);
		System.out.println(i2);
		// toString 재정의 됨, 값 자체(리터럴) 리턴
		
		System.out.println(i1.equals(i2));
// compareTo: 두 값을 비교하여 앞 쪽의 값(i1)이 크면 1반환, 뒤쪽의 값(i2)이 크면 -1반환, 같으면 0반환
		System.out.println(i1.compareTo(i2));
		
		//래퍼 클래스는 보통 "문자열" 형태에서 래퍼 클래스 형태로 변환하고자 할 때 사용
		Integer i3 = Integer.valueOf("500"); // "500"으로 받고 싶다
		Integer i4 = Integer.valueOf("777");
		
		Double d1 = Double.valueOf("3.14");
		
		// UnBoxing: Wrapper 클래스에서 기본자료형으로
		//수동 언박싱
		int n3 = i3.intValue(); 
		double n4 = d1.doubleValue();
		//자동 언박싱
		int n5 = i4;           
		 
		
		
		

	}

}
