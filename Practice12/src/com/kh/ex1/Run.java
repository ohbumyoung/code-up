package com.kh.ex1;

import java.time.LocalDate;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 입력: ");
		String str = sc.nextLine();
		
		if(str.length() != 14) {
			System.out.print("잘못 입력");
		} else {
			String result = "";
			// 출생연도 계산
			// 입력받은 주민번호의 앞 자리 2자 추출: substring(시작인덱스, 끝인덱스)
			String strYear = str.substring(0, 2);
			
			// 입력받은 주민번호의 인덱스 7번 위치값 추출: charAt(인덱스)
			char gender = str.charAt(7);
			int birthYear = 0;
			
			if(gender == '1' || gender == '2') {
				birthYear = 1900 + Integer.valueOf(strYear);
				//result = 1900 + Integer.valueOf(strYear) + "년생 출생";
				
			}else if (gender == '3' || gender == '4') {
				birthYear = 2000 + Integer.valueOf(strYear);
				//result = 2000 + Integer.valueOf(strYear) + "년생 출생";
			}
			result = birthYear + "년생 출생";
			
			//성별 계산
			if(gender == '1' || gender == '3') {
				result += "/ 성별: 남성";
			}else if (gender == '2' || gender == '4') {
				result += "/ 성별: 여성";
			}
			//나이 계산: 
			//현재 연도 추출
			int currYear = LocalDate.now().getYear();
			
			int age = currYear - birthYear + 1;
			
			result += "/ 나이: " + age + "세";
			
			System.out.println(result);
			
		}
		
	}
}
		
		
		
		
		
	

	

	


