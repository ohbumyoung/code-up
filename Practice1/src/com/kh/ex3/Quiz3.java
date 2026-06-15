package com.kh.ex3;

	import java.util.Scanner;
	
public class Quiz3 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("상품명을 입력하세요 :");
		
		String name = sc.nextLine();
		
		System.out.print("수량을 입력하세요 :");
		
		int num = sc.nextInt();
		
		System.out.print("단가를 입력하세요 :");
		
		double pi = sc.nextDouble();
		
		System.out.println("--- 장바구니 영수증 ---");
		
		System.out.println("상품명 :" + name);
		
		System.out.printf("수량: %d 잔\n",num);
		//System.out.printf("%-7s: %d 잔\n", "수량" , num);
		
		System.out.printf("단가: %.2f 원\n",pi);
		//System.out.printf("%-7s: %.2f 원\n" , "단가" , pi);
		
		System.out.println("--------------------");
		
		System.out.printf("총금액 : %.2f 원", num * pi);
		
		
		sc.close();
		
		
	}

}
