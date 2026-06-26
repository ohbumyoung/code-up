package com.kh;
import java.util.Scanner;
public class Quiz1 {

	public static void main(String[] args) {
		/*
		**입출력 예시**


1. 입력
2. 수정
3. 조회
4. 삭제
7. 종료

메뉴 번호를 입력하세요 : 3
조회 메뉴입니다.



1. 입력
2. 수정
3. 조회
4. 삭제
7. 종료

메뉴 번호를 입력하세요 : 7
프로그램이 종료됩니다.
*/
	
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		/*
		switch(num) {
		case 1: System.out.println("입력");
		break;
		
		case 2: System.out.println("수정");
		break;
		
		case 3: System.out.println("조회");
		break;
		
		case 4: System.out.println("삭제");
		break;
		
		case 7: System.out.println("종료");
		break;
		}
		System.out.print("프로그램을 종료합니다.");
		*/
	
		//if문
		
		if (num == 1) {System.out.println("입력");
		} 
		else if (num == 2) {System.out.println("수정");
		}else if (num == 3) {System.out.println("조회");
		}else if (num == 4) {System.out.println("삭제");
		}
        else if (num == 7) {System.out.println("삭제");
		
		}
        else {
        }
	}
}		
		
		