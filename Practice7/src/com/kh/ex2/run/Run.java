package com.kh.ex2.run;
import com.kh.ex2.model.vo.Book;
public class Run {

	public static void main(String[] args) {
		// 기본생성자로 Book 객체 생성
		Book b1 = new Book();
		b1.setTitle("객체지향의 사실과 오해");
		b1.setAuthor("조영호");
		b1.setPublisher("위키북스");
		b1.setPrice(25000);
		b1.setDiscountRate(0.1);
		
		// 매개 변수가 3개인 생성자로
		// title, uthor, publisher 에 맞는 자료형 입력 ex) String "", 
		Book b2 = new Book("클린 코드","인사이트","로버트 C. 마틴");
		
		//저장되지 않은 정보 -> 가격, 할인율
		b2.setPrice(38000);
		b2.setDiscountRate(0.15);
		
		// 매개변수가 5개인 생성자로 
		Book b3 = new Book("실용주의 프로그래머","앤드류 헌트,데이비드 토마스", "인사이트", 35000, 0.15);
		
		b1.inform();
		b2.inform();
		b3.inform();
	}

}
