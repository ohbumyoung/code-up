	/*
		 반목문: 특정 코드를 반복적으로 수행하는 문법
		 
		 1.for 문
		 for(초기화식; 조건식; 증감식) {
		 	반복적으로 실행할 내용
		 	}
		 	
		 	for 문 실행 순서
		 	초기식-> 조건식검사 -> true -> 실행할 내용 수행 -> 증감식 -> 조건식검사 -> true -> 실행할 내용 수행 -> false가 나오면 수행종료
		 	
		 	*참고: 초기식, 조건식, 증감식은 생략이 가능하다.
		 	=> 세미클론(;)은 반드시 작성
		 	
		 	-증감식 생략: for(초기식; 조건식;){}
		 	
		 	-조건식 생략: for(초기식; ; 조건식;){}
		 
		 	-초기식 생략: (; 조건식; 증감식;){}
		 	
		 	-모두 생략: (;;){}
		 
		 
		 Hello 5번 출력하기(반복문)
		 
		 for(초기식; 조건식; 증감식){}
		 초기식: int i = 0;
		 조건식: i < 5
		 증감식: i++
		 
		 for(int i = 0; i < 5; i++){
		 	System.out.println(i + " : Hello");
		 }
		 */

package com.kh;

public class A_For {
	
	public static void main(String[]args) {
		
		//method1();
		//method2();
		//method3();
		//method4();
		method5();
	}
	
	public static void method1() {
		
		
		
		/*
		for(int i = 0; i < 5; i++){
		 	System.out.println(i + " : Hello");
		 */	
		 
		
		for(int i = 5; i > 0; i-- ) {
			System.out.println(i + " : Hello");
		
	}
}

	public static void method2() {
		//1 ~ 10까지 출력
		//1 2 3 4 5 6 7 8 9 10
		
		//반복할 내용 => 출력
		
		//i > 0 && i < 11;
		
		/*
		for(int i = 1; i <= 10;  i++) {
			
			System.out.print(i + " ");
		}
		*/
		
		//10 ~ 1까지 출력
		System.out.println("");
		
		for(int i = 10; i > 0; i--) {
			
			System.out.print(i + " ");
			
		}
	}

	public static void method3() {
		// 1부터 10까지의 합
		
		int total = 0; //
		
		for(int i = 1; i <= 10; i++) {
			//System.out.printf("%d + %d = %d\n", total, i, total+i);
			
			total = total + i; // [i: 1 ~ 10 변수], [total: n+i(1~10) -> n+1 + n+2 + n+3 + n+4... 더해주는 변수]
			
			//total += i;
		}
		System.out.print("1부터 10까지의 합: " + total);
	}
	public static void method4() {
		
		/*
		 [랜덤값 구하는 방법]
		 -Math : java.lang.Math import 안하고 그냥 사용가능
		 Math. random() 을 사용 // 랜덤값 코드
		 0.0 ~ 0.999... ( 0.0 <= 랜던값 < 1.0) // Math 범위
		 
		 1 ~ 10까지 랜덤값 추출
		 Math.random() * 10 => 0.0 ~ 9.999...
		 Math.random() * 10 + 1 => 1.0 ~ 10.999...
		 
		 (int)(Math.random() * 10 + 1) // 소수점을 정수로 강제변환
		 */
		
		// 1부터 랜덤값 까지의 총 합
		int random = (int)(Math.random() * 10 + 1);
		
		System.out.println("랜덤값 : " + random);
		
		int total = 0;
		for (int i = 1; i <= random; i++) {
			total += i;
			
		}
		System.out.print("1부터 " + random + "까지의 합 : " + total);
		
	}

	public static void method5() {
		// 구구단 6단 출력
			
		for (int i = 1; i <= 9; i++) {
			
			int result = 6 * i;
			
			System.out.printf("6 x %d = %d\n", i, result);
			
			
				}
			}
		
		
		
	}



	



