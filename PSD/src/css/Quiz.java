package css;

import java.util.Scanner;

public class Quiz {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자 하나를 입력받는다.
		
		char ch = sc.next().charAt(0); //char는 한문자 밖에 못쓰니깐 그걸 해결하기 위해 charAT(n) n번째 용어를 sc.next()를 사용하여 변환  
		char result = (char)(ch + 1); // 변환된 변수값 ch에+1을 해서 다시 char로 바꾼다.
		
		
		
		// 다음 문자를 출력한다.
		
		System.out.print(result);
		
		/*
		char name;
		
		System.out.print("영문자를 입력하세요.");
		
		String str = sc.next(); // 
		
		//str.charAt(0);
		
		name = str.charAt(0);
		
		char result = (char)(name+1);
		
		System.out.print(result);
		
		char name;
		name = 'a';
		
		char name2;
		name2 = sc.next().charAt(0);
		
		char ch = 'a';
		char ch2 = sc.next().charAt(0);
		
		*/

		}

}
