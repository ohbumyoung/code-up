package com.kh.ex2;

public class Run {

	public static void main(String[] args) {
		
		
		Shape[] arr = new Shape[2];
		arr[0] = new Circke(5);
		arr[1] = new Rectangle(3, 4);
		
		for(Shape s:arr) {
			if(s instanceof Circke) {
				System.out.println("원의 넓이 : ");
			}else if (s instanceof Rectangle) {
				System.out.println("사각형의 넓이 : ");
				
			}
			System.out.println(s.calulateArea());
		}
		
		// [원(반지름:5), 사각형(가로:3, 세로4)] 크기가 2인배열
		
		// 출력
		/*
		 
		 원의 넓이 : 0000
		 사각형의 넓이 : 0000
		 */

	}

}
