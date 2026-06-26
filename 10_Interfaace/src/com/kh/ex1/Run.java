package com.kh.ex1;
import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 선택한 메뉴에 따라 동물 객체를 저장 (배열 크기 3)
		Animal[] animal = new Animal[3];
		
		for(int i = 0; i<animal.length; i++) {
			System.out.println("===동물을 선택하시오===");
			System.out.println("1. 강아지");
			System.out.println("2. 닭");
			System.out.println(": ");
			
			int num = sc.nextInt();
			
			if(num == 1) {
				animal[i] = new Dog();
				
			}else if (num == 2) {
				animal[i] = new Chicken();
			}
		}
		
		for(Animal ani : animal) {
			ani.makeSound();
			if(ani instanceof Baby) {
				System.out.println("아기라서 움직일 수 없습니다");
				
			}else {
				ani.move();
			}
			
		}
	}

}
