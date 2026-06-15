package com.kh;

public class A_Arithmetic {

public static void main(String[] args) {
	
	method2();
	
}
	
	/*public static void method1() {
		
		int n1 = 10;
		
		int n2 = 3;
		
		// n1, n2의 합, 차, 곱, 몫, 나머지 출력
		
		System.out.println("n1 + n2= " + (n1 + n2));
			
		System.out.println("n1 - n2= " + (n1 - n2));
		
		System.out.println("n1 * n2= " + (n1 * n2));
		
		System.out.println("n1 / n2= " + (n1 / n2));
		
		System.out.println("n1 % n2= " + (n1 % n2));
			
	}
	*/

	public static void method2() {
		
		int a = 5;
		int b = 10; //[b=9]
		
		int c/*=16*/ = ++a + b; // 6+10 [a=6]
		int d/*=2*/ = c / a; // 16/6 
		int e/*=4*/ = c % a; // 16%6 [e=5]
		int f/*=5*/ = e++; // 
		int g/*=11*/ = --b + d--; //g=11 [b=9,d=1]
		int h/*=2*/ = 2;
		int i/*=16*/ = a++ + b / (--c / f) * (g-- - d) % (++e + h); 
		
		//a=7, b=9, c=15, d=9, e=6, f=4, g=10, h=2, i=12 
		
		
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		
		
		
		//=> d, e, f, g, h, i
		
	}
}


