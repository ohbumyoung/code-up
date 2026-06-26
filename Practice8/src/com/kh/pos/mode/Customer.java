// 고객정보
package com.kh.pos.mode;

public class Customer{
	private String name;  // name라는 변수를 문자로
	private int age; 	 // age라는 변수를 정수로
	private int points;  //points라는 변수를 정수로 
	
	public Customer() {  // 비서에게 시킬 내용들 (전달하는 값은 없다.)
		super();
	}
	
	public Customer(String name, int age) { // 비서에게 시킬 내용들(이름과 나이를 전달한다.)
		super(); //			this.name이라는 필드변수에 name을 대입
		this.name = name;  // this.name = name; => name(문자열)으로 초기화시킨다. 초기값을 
		//					 정해놓은 값("홍길동")으로 해놓으면 다른 객체를 만들어도 홍길동으로 되니깐
		this.age = age;   // 같은 내용
		
		
	}

	public String getName() {  // 변수.getName을 통해 입력된 값을 가져옴
		return name;  // 현재 객체에 저장되어 있는 name필드에 값 
		// set이 없으면 초기값으로 리턴한다.
	}
	
	public int getAge() {
		return age;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) { // Points 값을 저장 (포인트 전달)
		this.points = points;
	}

	public String toString() {
		//return String.format("%s,%d,%d", name, age, points);
			return "Customer [name=" + name + ", age=" + age + ", points=" + points + "]";
		
		//고객의 이름, 나이, 현재 보유 포인트를 포맷에 맞춰 문자열로 반환합니다.
	}
}
