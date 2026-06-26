package com.kh.ex3;
import java.util.Scanner;
public class Quiz3 {
	
	public static void main(String[] args) {
		/*
		 **입출력 예시**


점수를 입력하세요(0-100): 80
B

점수를 입력하세요(0-100): -10
점수를 올바르게 입력해주세요.
 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0-100): ");
	
		int score = sc.nextInt();
		
			if (score >= 0 && score <= 100) {
				
				if (score >= 90) {System.out.println("A");
			}else if (score >= 80) {System.out.println("B");
			}else if (score >= 70) {System.out.println("C");
			}
	        else {System.out.println("F");
			
			}
			}
	        else {System.out.println("점수를 올바르게 입력해주세요.");
	        }
	}
}

		
		
	


