package com.kh.ex1;
import java.util.Scanner;
public class Quiz1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//사용자로부터 5명의 학생의 수학 점수를 입력 받아 크기가 5인 정수형 배열에 저장한 뒤, //
		//배열에 저장된 모든 점수의 총합과 평균을 계산하여 출력하는 프로그램을 작성하세요.
		//- 배열의 크기는 5로 고정합니다.//
		//- 총합은 정수로, 평균은 실수형으로 출력해야 합니다.
		//4,360,500,000
		// 75 80 85 90 95 +5
		
		int[] sArr = new int[5];
		
		/*
		System.out.print("1번 학생 점수 입력: ");
		sArr[0] = sc.nextInt();
		
		System.out.print("2번 학생 점수 입력: ");
		sArr[1] = sc.nextInt();
		
		System.out.print("3번 학생 점수 입력: ");
		sArr[2] = sc.nextInt();
		
		System.out.print("4번 학생 점수 입력: ");
		sArr[3] = sc.nextInt();
		
		System.out.print("5번 학생 점수 입력: ");
		sArr[4] = sc.nextInt();
		*/
		
		// 반복되는 부분이 있으니 반복문 사용
		for(int i=0; i<sArr.length; i++) {
			
			System.out.print((i+1) + "번 학생 점수 입력: ");
			sArr[i] = sc.nextInt();
		}
		
		// 총합과 평균 계산
		
		int total = 0;
		/*
		total = total + sArr[0];
		total = total + sArr[1];
		total = total + sArr[2];
		total = total + sArr[3];
		total = total + sArr[4];
		*/
		
		for(int i = 0; i < sArr.length; i++) {
			total += sArr[i]; // total = total + sArr[i];
		}
		//평균
		double avg = (double)total / sArr.length;
		
		// double = 8b, int = 4b 강제 형변환 시켜서 계산하기 
		
		System.out.print("총합: " + total + "점");
		System.out.print("평균: " + avg + "점");
	}
}
		

		
			
		
			
			
		
		
		
	
		
		
		
		
		
				
		
		
		
		
		
		/*
		int[] sco = new int[5];
		
		sco[0] = 80;
		sco[1] = 95;
		sco[2] = 90;
		sco[3] = 75;
		sco[4] = 85;
		
		int a = sco[0] + sco[1] + sco[2] + sco[3] + sco[4];
		double b = a/5;
		
		
		
		//int c = (sco[0] * sco[1] * sco[2] * sco[3] * sco[4]);
		//int d = (sco[0]*sco[1]*sco[2]*sco[3]);
		*/
		
		
	
		
		 
		
		
		
		
		
	
	


