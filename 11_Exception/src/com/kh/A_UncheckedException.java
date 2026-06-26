package com.kh;
import java.util.Scanner;
public class A_UncheckedException {
	/*
	 RuntimeException: 프로그램 실행 시 발생하는 예외들
	 => 대부분 예측 가능한 상황에서 발생허가애 if문 또는 조건식을 통해 애초에 예외가 발생되지 않도록 방지 가능
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	/**
	 * ArithmeticException 테스트
	 */
	
	public void test1() {
		System.out.print("첫번째 숫자: ");
		int n1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int n2 = sc.nextInt();
		
		//int result = n1/n2;
		//System.out.println("n1/n2= " + result);
		// => 두번째 숫자인 n2가 0인 경우 예외 발생 => 프로그램이 비정상 종료됨
		
		//예외 처리
		
		try {
			int result = n1/n2;
			System.out.println("n1/n2= " + result);
			
		} catch(ArithmeticException e){
			
			System.out.println("[Exception]0으로 나눌 수 없습니다.");
			
			System.out.println(e.getMessage());
			// .getMessage => 예외에 대한 설명을 문자열로 반환
			
	e.printStackTrace(); // => .printStackTrace 예외 정보, 발생 지점을 출력해주는 메소드 (반환형:void)
	/*이 내용들 
	//java.lang.ArithmeticException: / by zero
	at com.kh.A_UncheckedException.test1(A_UncheckedException.java:29)
	at com.kh.run.Run.main(Run.java:33)
	*/
	
		}
			
	}
	/**
	 * NegativeArraySizeException
	 * ArrayIndexOutOfBoundsException
	 */
	public void test2() {
		System.out.print("배열 크기: ");
		int size = sc.nextInt();
		
		/*
		int[] arr = new int[size];
		System.out.println("77번 인덱스의 값 :" + arr[77]);
		
		}
		*/
		
		try {
			int[] arr = new int[size];
		System.out.println("77번 인덱스의 값 :" + arr[77]);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("[Exception]인덱스 접근 범위를 벗어났습니다.");
			System.out.println(e.getMessage());
		}
		catch (NegativeArraySizeException e) {
			System.out.println("[Exception] 배열 크기는 음수로 지정할 수 없습니다.");
			System.out.println("입력한 크기: " + e.getMessage());
		}
	}
	/**
	 * catch 블록에 사용할 예외가 상속 관계일 때 테스트
	 */
	public void test3() {
		
		System.out.print("배열 크기: ");
		int size = sc.nextInt();
		
		try {int[] arr = new int[size];
		System.out.println("77번 인덱스의 값 :" + arr[77]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
		} catch(RuntimeException e) {
			System.out.println("[Exception]배열 크기가 음수이거나, 실행 중 어떠한 에러 발생했다." );
			e.printStackTrace();
			// 상속관계인 경우 부모 에러가 자식 에러보다 아래
		}
	}
	
	
}
		
		
	
	
	

