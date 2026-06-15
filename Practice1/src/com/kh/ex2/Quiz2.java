package com.kh.ex2; //기본제공

import java.util.Scanner; // 저장공간 만들기

public class Quiz2 { //기본제공 

public static void main(String[] args) { // 시작점 실행이 되는곳 
	
	Scanner sc = new Scanner(System.in); //객체 생성
		
	System.out.print("이름을 입력하세요: "); // 메시지 출력
	
	//String value = sc.nextLine(); // 입력값 저장, value=변수 (value(변수)를 name으로 지정)
	String name = sc.nextLine();
	
	System.out.print("나이를 입력하세요: "); // 메시지 출력
	
	//String age = sc.nextLine(); //(value(변수)를 age로 지정)
	int age = sc.nextInt();
	
	
	//System.out.printf("%s(%s세)의 자바 학습을 환영합니다!", name, age); //메세지 출력
	System.out.printf("%s(%d세)의 자바 학습을 환영합니다!", name, age);
	
	sc.close();
	
}
}