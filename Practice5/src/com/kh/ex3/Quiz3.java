package com.kh.ex3;
import java.util.Scanner;
public class Quiz3 {

	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		/*
		# 첫 번째 숫자가 더 큰 경우
		첫 번째 숫자 : 8
		두 번째 숫자 : 4
		4 5 6 7 8
		

		
		# 두 번째 숫자가 더 큰 경우
		첫 번째 숫자 : 4
		두 번째 숫자 : 8
		4 5 6 7 8
		

		
		# 1 미만의 숫자가 포함된 경우
		첫 번째 숫자 : 9
		두 번째 숫자 : 0
		1 이상의 숫자를 입력해주세요.
		*/
		
		System.out.print("첫 번째 숫자 : ");
		int n1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int n2 = sc.nextInt();
		
		if (n1 >= 1 && n2 >= 1) {
			// n1 값과 n2 값의 대소 비교
			int max = (n1 > n2) ? n1 : n2; // 큰 값
			int min = (n1 < n2) ? n1 : n2; // 작은 값
			
			// 초기식: int i = min;
			// 증감식: i++;
			// 조건식: i <= max;
			
			for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요.");
			
		}
		
		
			
		}
		}
	

			
			
			
		
		
		
		
	


