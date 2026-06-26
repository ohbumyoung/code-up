package com.kh.run;
import com.kh.menu.Drink;
import com.kh.menu.Americano;
import com.kh.menu.Latte;
public class Run {

	public static void main(String[] args) {
		
		
				// Drink 타입의 크기가 2인 배열 생성
				Drink[] menu = new Drink[2];
				// 각 배열에 아메리카노(2000원), 라떼 (3000원) 데이터를 추가
				menu[0] = new Americano("아메리카노", 2000);
				menu[1] = new Latte("라떼", 3000);
				
				
				
				for(int i = 0; i<menu.length; i++) {
					
					String name = menu[i].getName(); 
					// 자식 객체인 Americano ,Latte에 저정된 이름 가져옴 0번 일때 아메, 1번일때 라떼
					
					int price = menu[i].getPrice();  // 가격
					// 자식 객체인 Americano ,Latte에 저정된 가격 가져옴 0번 일때 아메, 1번일때 라떼
					
					System.out.printf("%s%d\n", name, price);
					menu[i].order(); // Drink 에 저장된 order 가져옴
				} 
					}
					
				
				
				

			
			


	}


