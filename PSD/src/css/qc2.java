package css;

import java.util.Scanner;

public class qc2 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
	
		
		for(int i = 1; i<=50; i++) {
			
			int result = i/1;
			int result2 = i/10;
			int result3 = i%10;
			//int result4 = i-10;
			System.out.println("--------");
	
		if (i < 10) {
			if(result == 3 || result == 6 || result == 9) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
			
		}
		else{
			
			boolean a = result2 == 3 ||result2 == 6||result2 == 9;
			boolean b = result3 == 3 ||result3 == 6||result3 == 9;
			
			if(a) {
				System.out.println("짝");
			}
			if(b) {
				System.out.println("짝");
			}
			
			if(!a&&!b) {
				System.out.println(i);
			}
		}
			
		}
		
		/*
		// 10 이하일때
		if(result == 3 || result == 6 || result == 9) {
			System.out.println("짝");}
		
		
		// 10이상
		else if(result4 == 3 || result4 == 6 ||result4 == 9) {
			System.out.println("짝2");
		}
		
		// 30 빼고 3 6 9일때
		else if(result3 == 3 || result3 == 6 || result3 == 9) {
				System.out.println("짝3");
			
			}
		
		//30 31 32 34 35 37 38일때
		
		
		// 33 36 39 일때
		else if (result2 == 3 ||result2 == 6 ||result2 == 9) {
			System.out.println("짝4" + " Wk);
		}
		
			
		else {
			System.out.println(i);}
		
				
		
		}
		*/
			System.out.println("-----------------");
	} 
		}

	

		
		
		// i%10 == 3 6 9 -> 짝
		// i/10 == 3 
		// 두개를 만족하면 짝,짝
		
		
		/*
		for(int i = 1; i<=50; i++) {
			{System.out.println(i);
			int n = i%10;
			if(n == 3 || n == 6 || n==9) {
				System.out.println("짝" );
				
				}
			
			if(i/10 == 3) {System.out.println("짝");
				
				
			}
		 
				
			}
			*/	
				
		
		
	
	
	
	
	
	


	


