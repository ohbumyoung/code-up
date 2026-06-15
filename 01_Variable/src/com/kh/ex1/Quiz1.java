package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("이름:");
		
		String name = sc.nextLine();
		
		System.out.print("나이:");
		
		int age = sc.nextInt();
		
		System.out.print("키:");
		
		double tall = sc.nextDouble();
		
		System.out.println("====================");
		
		System.out.println("이름:" + name);
		
		System.out.println("나이:" + age +"세");
		
		System.out.println("키:" + tall + "cm");
		
		System.out.println("====================");
		
		//System.out.printf("%s님의 나이는 %d이며 키는%.4f 입니다.", name, age, tall);
		
		sc.close();
		
							
	}

}



/*
이름: 이순신
나이: 25
키: 176.5

String name = sc.nextLine();
Scanner sc = new Scanner(System.in);
*/
