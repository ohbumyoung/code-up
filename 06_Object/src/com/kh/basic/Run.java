package com.kh.basic;
// [클래스 생성 => new 생성자;]
// new 클래스명(); -> 기본생성자
// . -> 참조,연결해주는 용도
public class Run {
	/*
	 객체 생성 및 사용법
	 - 변수 선언 (참조 변수 공간 확보) => 클래스명 변수명;
	 
	 객체 생성 및 할당
	 -생성: new 생성자;
	 
	 -할당: 변수 = new 생성자;
	 
	 -선언과 할당 동시에 하기
	  클래스명(Person) 변수명 = new 생성자;
	  
	  -객체 맴버(변수, 메소드) 접근하기: 연결 연산자(.) 사용
	  맴버 변수 접근: 참조 변수.맴버 변수 
	  맴버 메소드 호출: 참조변수.메소드명()
	  
	  *생성자 활용 참고*
	  -기본생성자 사용 
	  => 맴버 변수 값을 나중에 하나하나 저장 (각 자료형의 기본값을 채워짐 ex)String: null, int: 0, double: 0.0
	  
	  -매개변수가 있는 생성자를 사용할 경우
	  => 객체를 만들면서 동시에 특정 값을 바로 저장
	 	
	 */

	public static void main(String[] args) {
		
		
		Person p1;  //선언만 했을 경우 => 해당 변수는 null 값을 가지고 있음
		
		// Person 객체 생성 및 할당
		p1 = new Person();
		
		p1.introduce();
		
		System.out.println("------내 정보-------");
		
		//이름, 나이, 성별에 값을 저장(대입)
		p1.name = "오범영";  // 참조변수.맴버변수 = ""; name은 String 타입이기에
		p1.age = 2;
		p1.gender = 'M';
		
		// 자기소개 기능 호출
		p1.introduce();  // 참조변수, 메소드명 = 어떠한(자기소개) 기능 호출
		
		System.out.println("------짝꿍 정보-------");
		
		// 선언과 생성을 동시에
		Person p2 = new Person("김철수"); // 다른 사람 변수 (짝궁)
		p2.age = 20;
		p2.gender = 'M';
		p2.introduce();
		
		System.out.println("------연예인 정보-------");
		
		// 모든 정보를 객체 생성 시 저장
		Person p3 = new Person("김영희", 20, 'F');
//	public Person(String name, int age, char gender) 생성자를 이렇게 만들었기에 "이름", 나이, 성별로 입력 가능
		p3.introduce();
	}

}
