package com.kh;

public class B_Cast {

	public static void main(String[]args) {
		
		//autiCasting();
		
		forceCasting();
			
	}
	
	public static void forceCasting() {
		
		/*
		 * 강제 형변환 : 자동 형변환이 되지 않는 경우, 직접 형변환을 해주는 것
		 * (변환될 자료형)변환할대상 
		 */
		
		
		//주의사항: 강제 형변환 시 데이터 손실이 발생 될 수 있음
		int i2 = 290;
		byte i3 = (byte)i2;
			
			System.out.println("i3:" + i3);
			
		
		// 실수형 변수 d1에 4.0 이라는 값을 저장
		double d1 = 4.0;
				
		// 정수형 변수 i1에 50이라는 값을 저장
		int i1 = 50;
		
		// d1 의 값과 i1의 값을 더해서 정수형 변수 result 에 저장
		
		int result = (int)d1 + i1;
		
		System.out.print("d1+i1 값:" + (int)d1 + i1);
		
		//(int)d1+i1 이랑 (int)(d1+i1) 쓰는 방법 차이?
		
		
	}
	
	
	public static void autiCasting() {
		
		// 자동 형변환 : 값의 범위가 작은 자료형에서 넓은 자료형으로 자동으로 변환 
		
		
		// 정수형 변수 i1에 12라는 값을 저장
		int i1 = 12;
		
		
		// 실수형 변수 d1에 i1의 값을 저장
		double d1 = i1;
		
		System.out.print("d1:" + d1);
		
	}
	
}
