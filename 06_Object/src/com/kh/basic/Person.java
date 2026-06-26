package com.kh.basic;
/*
[변수: 값을저장]
 클래스 구조 (코드)
 
 	접근제자 class 클래스명 {
 	
 		변수부(필드부): 변수에 해당하는부분
 		: 데이터를 저장할 공간을 선언하는 부분
 		
 		생성자부: 생성자 부분
 		: 객체를 생성하기 위한 특별한 메소드를 정의하는 부분
 		  => 데이터를 초기화하기 위한 목적으로 정의
 		
 		메소드부: 메소드 부분
 		: 기능을 정의하는 부분
 }
 */

public class Person {
	/*
	 추상화 해보기 => 객체를 어떻게 표현할 것인지 정리하는 과정
	 
	 [사람] 이라는 객체 설계
	 1. 떠오르는 것들을 나열
	 	이름, 나이, 성별, 직업, 국적, 키, 취미, 걷다, 말하다, 뛰다 ....
	 
	 2. 필요한 항목들만 추리기 (1. 에서 필요없는 것들 정리하기)
	 	이름, 나이, 성별, 말하다, 울다
	 	
	 3. 저정할 데이터의 형태를 정리해보기
	 	이름=>String(문자열), 나이=>int(정수), 성별=>char, M/F(문자) 
	 
	 EX)------필드부---------
	 */
	 String name;	//이름
	 int age;		//나이
	 char gender; 	//성별
//   -----------------------	 
	 /*
	  생성자특징
	  1. 반환형 없음
	  2. 생성자명은 클래스명과 동일
	  */
//	 -------생성자부---------
	 public Person() {
	 // 생성자 특징: 접근제한자 메소드이름 ()
	 // 기본 생성자: 정의된 생성자가 없는 경우 자동으로 만들어진다.
		 
	 }
	 
	 public Person(String name) {
		 this.name = name; 
	 }
	 
	 public Person(String name, int age, char gender) {
		// 매개변수는 필드부에 만든거(3개)
		 this.name = name;
		 this.age = age;
		 this.gender = gender;
     
	 }
	 
//	 -----------------------
	 
//	 -------메소드부---------
//	 소개하는 메소드
//	 :저장된 이름, 나이, 성별 정보를 출력
//	 접근 제한자 예약어 반환형 메소드명(매개변수) {
//   실행할 내용}
	  
	  
	  
	 public void introduce() {
		 System.out.println(this.name + "," + age + "," + this.gender);
	 }
	 
	 /**
	  * 말하다
	  * : "안녕하세요" 출력
	  */
	 public void speak() {
		 System.out.println("안녕하세요");
	 }
	 
	 /**
	  * 울다
	  * : "엉엉" 출력
	  */
	 public void sad() {
		 System.out.println("엉엉");
	 }
}
