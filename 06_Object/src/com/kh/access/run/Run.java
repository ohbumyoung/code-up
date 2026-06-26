package com.kh.access.run;

import com.kh.access.AccessTest;

public class Run {

	public static void main(String[] args) {
		// AccessTest 객체 생성
		
		//public은 다른 패키지에서도 사용 가능하기에 가능
		AccessTest test = new AccessTest();
		
		System.out.println(test.publicField );
		
		test.publicMethod();
		
		/*
		패키지 경로가 다르기 때문에
		System.out.println(test.protectedFiedl); 
		
		String str = test.defaulField;
		test.defaulMethod();
		
		String str = test.privateField;
		test.privateMethod();
*/
	}

}
