package com.kh.ex3;

import java.util.Scanner;

public class Quiz3 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 소문자를 지정할 char 변수 선언
		char so;
		
		// 소문자 입력받기
		System.out.print("소문자 입력 : ");
		
		String str = sc.next();
		
		//문자열 길이 : str.length()
		
		//특정 위치의 한 문자를 추출 : 문자열.charAt(위치);
		// 위치는 0부터는 시작
		
		//"happy" 라는 문자열에서  (문자열.charAt(위치)) "happy.charAt(0) - h
        //                                         "happy.charAt(3) - p
		//                                         "happy.charAt(4) - y
	    str.charAt(0);
		
		so = str.charAt(0);
		
		
		//System.out.println("입력 받은 값 : " + str);
		
		//System.out.println("추출 한 값 : " + so);
		
		//소문자를 대문자로 변환
		// 'a' = 97. 'A' = 65
		char result = (char)(so - 32);
		// char 결과 = so-32를 하고 char형으로 변환
		
		
	    // so (char, 2B) - 32 (int, 4B)
		// so (char->int) - 32 -> (int) = 97 - 32 = 65
		
		// char result = 65
		
		System.out.println("소문자 : " + so);
		System.out.println("대문자 : " + result);
		
		
		
		
				
		
	}

}



/*
 * 입력 예시 : 소문자 입력: a
 * 
 * 출력 예시
 * 소문자: a
   대문자: A
 */
 