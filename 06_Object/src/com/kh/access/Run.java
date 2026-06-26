package com.kh.access;

public class Run {

	public static void main(String[] args) {
		// AccessTest 객체 생성 및 할당
		
		AccessTest test = new AccessTest();
		
		//public 맴버 => publicField(변수), publicMethod(메소드)
		String pf = test.publicField;
		System.out.println("publicField : " + pf);
		
		test.publicMethod();
		
		//protected 맴버 => protectedFiedl(변수), protectedMethod(메소드) 
		String ptf = test.protectedField;
		System.out.println("protectedFiedl : " + ptf);
		
		test.protectedMethod();
		
		// default 맴버 => defaultFiedl(변수), defaultMethod(메소드)
		System.out.println(test.defaultField) ;
		
		test.defaultMethod();

		// private 맴버 => privateFiedl(변수), privateMethod(메소드)
		// private은 같은 클래스에서만 사용 가능하기에 클래스가(Run)인 여기에서는 사용 불가능
		
		// System.out.println(test.privateField) ; -> 사용불가
		// test.privateMethod(); -> 사용불가
	}

}
