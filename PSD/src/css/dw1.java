package css;
import java.util.Scanner;
public class dw1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		/*
		 두 정수(a, b)를 입력받아 a와 b가 같으면 1을, 
		 같지 않으면 0을 출력하는 프로그램을 작성해보자.
		 
		 두 정수 a, b가 공백을 두고 입력된다. 
         a와 b의 값이 같은 경우 1을, 그렇지 않은 경우 0을 출력한다.
         
         0 0 / 1
		 */
		
		//a==b = 1 
		//a!=b 0
		
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean n1 = (a==b);
		boolean n2 = (a!=b);
		
		if(n1) {
			System.out.print(1);
			
		}else {
			if(n2) {
				System.out.print(0);
			}
		}
	
		
		
	
		
		
		
	
		
			
			
			
		
		
		
	}
}