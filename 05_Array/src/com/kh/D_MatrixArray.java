package com.kh;

public class D_MatrixArray {
	/*
	 2차원 배열: 1차원 배열의 묶음
	 할당된 공간마다 인덱스 번호를 두 개를 부여 []행 []열
	 행: 몇 번째 1차원 배열인지
	 열: 1차원 배열에서 몇 번째 위치의 데이터인지
	 
	 선언
	 	자료형[][] 변수명; //권장
	 
	 할당(생성)
	 	변수명 = new 자료형[행크기][열크기]
	 행크기: 1차원 배열의 개수
	 열크기: 1차원 배열의 크기 (생략가능 => 다양한 길이의 1차원 배열 할당)
	 	
	 	선언 및 할당
	 		자료형[][] 변수명 = new 자료형 [행크기][열크기];
	 	
	 	값 대입
	 		변수명[행 인덱스][열 인덱스] = 값;
	 		=> 행 인덱스: 몇 번째 1차원 배열인지
	 		=> 열 인덱스: 1차원 배열에서 몇 번째 위치인지
	 		
	 	초기화
	 		자료형[][] 변수명 = { 1차원_배열, 1차원_배열 ...}; = 자료형[][] 변수명 = { {값,값,값}, {값,값,값}, ...}
	 		자료형[][] 변수명 = { new 자료형[크기],new 자료형[크기],...} <- 이것도 가능
	 		
	 */
	
	public static void main(String[] args) {
		mathod2();
		
	}
	
	public static void mathod1() {
		// 정수형 2차원 배열
		int[][] arr; // 선언
		
		// 크기가 4인 1차원 배열 3묶음으로 할당 (3행 4열)
		//arr = new int[3][4]; //할당
		
		// 크기가 4인 1차원 배열 생성
		arr = new int [3][];
		/*
		arr[0] = new int[4];
		arr[1] = new int[4];
		arr[2] = new int[4];
		*/
		
		//반복문으로, // 2차원 배열의 행 크기 코드: 배열명.length
		for(int i=0; i < arr.length; i++) {
			arr[i] = new int[4];
			
		}	
		
		// arr[0].length => 열의 크기가 4, 해당 인덱스 위치의 1차원 배열 크기
		
		// 2차원 배열의 값 출력
		/*
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[0][3]);
		
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		System.out.println(arr[1][3]);
		
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
		System.out.println(arr[2][3]);
		*/
		
		// 위에 거 반복문을 활용
		for(int i=0; i<arr.length; i++) {
			// i: 행 인덱스
			for(int j=0; j<arr[i].length; j++) {
			// j: 열 인덱스
				System.out.print(arr[i][j] + " ");				
			}
			System.out.println();
		}
		
		// 값 대입
		// 초기화 (arr2 배열)
		int[][] arr2 = {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}
						};
		// arr2 배열에서 7을 출력
		
		System.out.print(arr2[1][2]); 
		
	}
	
	public static void mathod2() {
		/*
		 아래 문자열 데이터를 저장할 2차원 배열을 선언 및 생성하고 각 위치에 값을 대입해보자
		 "(0행 0열)""(0행 1열)""(0행 2열)"
		 "(1행 0열)""(1행 1열)""(1행 2열)"
		 "(2행 0열)""(2행 1열)""(2행 2열)"
		 
		 체크 사항
		 1) 데이터가 어떤 타입인가 (자료형) -> String
		 2) 몇 개의 행이 필요한가 (패턴 분석) ->3행
		 3) 한 행에 몇 개의 데이터를 저장할 것인가? ->3열
		 */
		
		/*
		 현재상태
		 null null null
		 null null null
		 null null null
		 */
		String[][] n = new String[3][3];
		
		/*
		 현재상태
		 "(0행 0열)""(0행 1열)""(0행 2열)"
		 	null 	  null 	    null
		 	null 	  null 	    null
		 */
		n[0][0] = "(0행 0열)";
		n[0][1] = "(0행 1열)";
		n[0][2] = "(0행 2열)";
		
		//반복문 사용
		/*
		for(int i = 0; i <n[0].length; i++) {
			n[0][i] = "(0행 " + i + "열)";
		}
		
		for(int i = 0; i <n[1].length; i++) {
			n[1][i] = "(1행 " + i + "열)";	
	}
		for(int i = 0; i <n[2].length; i++) {
			n[2][i] = "(2행 " + i + "열)";
		}*/
		for(int row = 0; row < n.length; row++) {
			
		
			for(int i = 0; i <n[row].length; i++) {
				n[row][i] = "(" + row + "행 " + i + "열)";	
	}
}
		
		//값 출력
		for(int row = 0; row < n.length; row++) {
			
			
			for(int i = 0; i <n[row].length; i++) {
				n[row][i] = "(" + row + "행 " + i + "열)";	
				
				System.out.print(n[row][i] + " ");
	}
			System.out.println();
}
}
}