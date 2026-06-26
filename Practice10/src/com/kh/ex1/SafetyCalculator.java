package com.kh.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafetyCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		System.out.println("안전한 나눗셈 계산기");
		
		try {
			System.out.print("첫번째 정수를 입력하세요: ");
			int n1 = sc.nextInt();
			
			System.out.print("두번째 정수를 입력하세요: ");
			int n2 = sc.nextInt();
		System.out.println("나눗셈 결과: " + (n1/n2));
		} catch(ArithmeticException e) {
		System.out.println("[ArithmeticException] 0으로 나눌 수 없습니다. 다시 시도해 주세요.");
		} catch(InputMismatchException e) {
		System.out.println("[InputMismatchException] 숫자만 입력할 수 있습니다.");
		}
		
		System.out.println("프로그램 종료");
		
		
		

}
}
