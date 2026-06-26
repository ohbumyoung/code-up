package com.kh.ex2;
import java.util.Scanner;
public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = {"사과", "딸기", "바나나", "키위", "복숭아"}; // 초기화 

		System.out.print("찾을 과일 이름을 입력하세요 ");
		String fName = sc.nextLine(); // 입력할 자료형
		
		//과일 목록에서 찾을 과일 찾기
		// 배열에서 입력 받은 값과 일치하는 항목 찾기
		int fIndex = -1; // 일치하는 과일을 찾았을 경우 해당 인덱스를 저장
		
		for(int i=0; i < name.length; i++) {
			boolean isEquals = name[i].equals(fName);
			
			if(isEquals) {
				fIndex = i;
				break; // 찾으면 반복문 종료
			}
		}
		// 찾았을 경우 {n}번째 인덱스에 있습니다. 출력
		// 없을 경유 "찾는 과일이 없습니다." 출력
		if (fIndex > -1) {
			System.out.println(fName + "은 배열의" + fIndex + "번 인덱스에 있습니다");
		} else {
			System.out.println("찾는 과일이 없습니다.");
			
				
		}
	}

}
