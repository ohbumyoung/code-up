package com.kh.ex4;
import java.util.Scanner;
public class Quiz4 {
	
	public static void main(String[]args) {
		
		//중첩 반복문
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		// 줄마다 "*"을 출력하기 위한 코드
		for(int i = 2; i <= num; i++) {     
		
			
			
		// "*"을 줄의 개수만큼 출력 ex) *+(*)
		// j 조건을 보고 true 면 밑에 반복문 실행, false 면 다시 위로 올라가서 i 조건을 확인 반복문 실행
		// 다시 i 조건이 true 면 밑에 j 조건을 확인하러간다
		// 다시 j 조건을 보고 true 면 밑에 반복문 실행, false 면 다시 위로 올라가서 반복문 실행
		// num 값과 일치하는 i 조건까지 위의 내용을 계속 실행
		
			for(int j = 2; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
