package com.kh.method;

public class Method1 {
	/*
	 메소드: 함수, 클래스 내에서 특정 기능을 묶어놓은 부분
	 
	 표현볍: 접근제한자 예약어 반환형 메소드 명(매개변수) {
	 	실행할 내용
	 }
	 - 예약어, 매개변수 생략가능 [접근제한자가 defalt 일때 생략가능]
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		//hE();  //he 매소드 호출
		
		//2.
		//("오범영"); // 전달값을 "오범영" 입력해주기 전달값 있고 / 결과값 없다.
		
		//3.
		int random1 = getRandom(); // 결과값을 돌려받고 그것을 저장하는 것을 만든다.
		System.out.println("랜덤값: " + random1);
		
		//4.
		int random2 = getRandom(10); // 전달받은 값 (end) (매개변수)에 원하는 숫자를 넣고 확인한다.
		System.out.print("랜덤값2: " + random2);
		}
	
	/**1.
	 * 메소드 실행 시 "Hi Everyone!"을 콘솔창에 출력
	 * main 메소드에서 호출할 예정
	 */
	// he 매소드 정의
	public static void hE() {
//  접근제한자 /예약어(생략가능) /반환형 /메소드명/ (매개변수[생략가능])		
	// void 결과 값<-메소드 명->() 전달 값
		System.out.println("Bye Everyone!");
		
	}
	
	/**2.
	 * 메소드 실행 시 이름(name)을 전달받아
	 * "안녕하세요" [변수]님 을 콘솔창에 출력
	 */
	public static void hi(String name) {
		
		System.out.println("안녕하세요 " + name + "님");
		
	}
	
	/**3.
	 * 메소드 실행 시 1 ~ 100 사이의 랜덤값을 추출하여 결과값으로 전달
	 */
	public static int getRandom() {
		
		int random = (int)(Math.random() * 100 + 1);
		// 메소드 실행 후 결과값을 돌려줄때
		// return;
		return random;
	}
	
	/**4.
	 * 메소드 실행 시 1 ~ 전달받은값(end) 사이의 랜덤값을 추출하여 결과값으로 전달
	 */
	public static int getRandom(int end) {
		
		int random = (int)(Math.random() * end + 1);
		// 메소드 실행 후 결과값을 돌려줄때
		// return;
		return random;
		
	}
}
