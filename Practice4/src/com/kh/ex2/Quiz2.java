package com.kh.ex2;
import java.util.Scanner;
public class Quiz2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n > 0) {
			if(n%2 == 0) {System.out.print("짝수입니다.");
			}
			else {System.out.print("홀수입니다.");
				
			}
		}
		
	}
}