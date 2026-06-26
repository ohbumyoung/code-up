package com.kh.run;

import com.kh.model.Student;
import java.util.Arrays;
import java.util.Scanner;
public class Run {
	/*
	 객체 배열: 여러 개의 객체를 저장하여 관리하는 구조
	 
	 주의사항: 배열을 생성(new 클래스명[크기])한다고 해서 실제 객체를 생성하는 것이 아니라
	 객체의 주소를 담을 수 있는 참조 변수만 만들어짐(기본값: null)
	 
	  선언: 클래스명[]변수명;
	  
	  할당(생성): 변수명 = new 클래스명[배열크기]
	  
	  값 대입(객체 생성): 변수명[인덱스] = new생성자; // 생성자는 클래스명();과 동일
	  
	  초기화
	  변수명 = { new생성자, 갯수만큼};
	 
	 */

	public static void main(String[] args) {
		// 크기가 3인 정수형 배열 선언 및 할당
		
		int[]num = new int[3];
		
		// [1,2,3] 대입
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;	
		
		//반복문 사용
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		System.out.println(Arrays.toString(num));
		System.out.println("--------");
		//학생 정보를 담을 객체 배열 선언 및 할당
		// -학생 클래스(Student)
		/*
		 -name : String
		 -age: int
		 -sc
		 */
		
		//학생 객체 생성	
		Student s1 = new Student(); // s1 -> 참조하는 위치에 | name(null) |age (0) | score(0.0)
		
		//학생 배열 생성
		Student[] arr = new Student[3]; // arr -> [null, null, null]
		
		// 배열의 각 위치에 학생 정보를 저장
		arr[0] = new Student("홍길동", 29, 70.5); // arr -> [홍길동학생의정보, null, null]
		arr[1] = new Student("전우치", 19, 80.5); // arr -> [홍길동학생의정보, 전우치학생의정보, null]
		arr[2] = new Student("임꺽정", 9, 90.5); // arr -> [홍길동학생의정보, 전우치학생의정보, 임꺽정학생의정보]
		
		/*
		 두번째 학생 정보 출력
		 1) 배열에서 몇번째 위치의 값으로 접근할 것인지 -> 1번 인덱스 사용
		 2) 학생 정보 출력 기능(메소드)가 있는지?
		 */
		arr[1].printInfo();
		
		/*
		 세번째 학생 정보 삭제
		 */
		arr[2] = null; // arr ->[홍길동학생정보, 전우치학생정보, null]
		//arr[2].printInfo(); // => 객체가 제거되었는 데 기능을 호출하려고 함
		//							null pointExceptin 발생
		
		System.out.println("--------");
		// 값을 입력받아 학생 정보 저장
		
		//반복문을 사용하여 입력 받은 값을 배열에 저장
		Scanner sc = new Scanner(System.in);
		
		Student[] arr2 = new Student[2];
		
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print("이름: ");
			String name = sc.next();
			
			System.out.print("나이: ");
			int age = sc.nextInt();
			
			System.out.print("점수: ");
			double score = sc.nextDouble();
			
			// i번째 위치에 입력 받은 학생 정보로 객체를 생성
			arr2[i] = new Student(name, age, score);
		}
		
		//출력 => 변수명.printInfo
		System.out.println("=== 학생 정보 ===");
		// for (자료형 변수명: 배열명){
		//}
		for (Student n : arr2) {         // n -> arr2[i]
			n.printInfo();
		}
	}

}
