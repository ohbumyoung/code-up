package com.kh;

public class B_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
	}	 
	
	public static void test1() {
		String str1 = "Friday";
		String str2 = "Friday";
		
		System.out.println(str1 == str2);
		// 결과가 true인 이유?
		// 문자열 값 자체(리터럴)를 대입하게 되면 "상수풀"이라는 공간에 저장되어 같은 곳을 가리키게 됨(주소값이 동일)
		
		System.out.println(str1 == "Friday");
		// str1이 가리키고 있는 주소(상수풀)와 "Friday"라는 값 자체가 저장된 주소를 비교 했는데 둘다 같은 곳을
		// 가리킴
		System.out.println("======new 생성자 사용할때======");
		
		String str3 = new String("Friday");
		String str4 = new String("Friday");
		
		System.out.println(str3 == str4);
		// 결과: false
		// 문자열 객체를 생성해서 값을 대입하게 되면 메모리에 새로운 영역에 할당 하므로 각각 다른 위치에 값이 저장
		
		System.out.println(str3 == "Friday");
		//str3는 새로운 공간을 참조하고 있고, "Friday"라는 값 자체는 상수풀에 저장되어 있어 주소값이 다름
		
		//*문자열의 값을 비교하고자 할 때: equals()
		System.out.println(str3.equals("Friday"));
		
		System.out.println("============");
		
		String str5 = "Good";
		String str6 = "Luck";
		
		System.out.println(str5.toString());
		// Object의 toString() => 클래스명@해시값
		
		//*주소값(해시값)을 반환: System.identiyHashCode(참조변수)
		int hash = System.identityHashCode(str5);
		System.out.println("해시값: Good" + hash );
		
		//문자열 합쳐주는 메소드: concat
		str5 = str5.concat(str6); //GoodLuck
		System.out.println("str5.concat(str6): " + str5);
		
		int hash2 = System.identityHashCode(str5);
		System.out.println("해시값: GoodLuck" + hash2);
				
	}
	
	public static void test2() {
		
		String str1 = "Hello";
		
		// toUpperCase: 문자열의 알파벳을 모두 대문자로 변환하여 리턴
		// toLowerCase: 문자열의 알파벳을 모두 소문자로 변환하여 리턴
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		// contains: 문자열 내에 특정 문자열이 포함되어 있는 지 여부를 리턴[여부를 리턴은(boolean)타입이다]
		System.out.println(str1.contains("Hello에 el이 포함되는가?:" + "el"));
		System.out.println(str1.contains("Hello에 kk이 포함되는가?: " + "kk"));
		
		//indexOf: 문자열 내에 특정 문자열이 포함되어 있는 시작 위치를 리턴(int)
		System.out.println(str1.indexOf("Hello에 el이 몇번째에 있는가?: " + "el"));
		System.out.println(str1.indexOf("Hello에 kk가 몇번째에 있는가?: " + "kk"));
		
		/*
		* substring
		문자열.substring(시작인덱스) => 문자열에서 시작인덱스 부터 마지막 위치까지 문자열을 추출 리턴
		문자열.substring(시작인덱스, 끝인덱스) => 문자열에서 시작인덱스부터 끝인덱스 직전까지 부분을 추출하여 리턴
		 */
		System.out.println("Hello의 인덱스 값 2번째부터 마지막까지 출력" + str1.substring(2));
		//값 llo
		System.out.println("Hello의 인덱스 값 2번째부터 4번째 까지 출력" + str1.substring(2, 4)); 
		//값 ll
		
		
		 //repeat: 문자열을 지정한 개수만큼 반복하여 리턴
		 
		System.out.println(str1.repeat(5));
		System.out.println("=".repeat(10));
		
		//split: 문자열을 #을 기준으로 분리하여 문자열 배열 형태로 리턴
		String str2 = "JAVA#SQL#HTML#CSS";
		String[] arr = str2.split("#");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
	}
	
	
}
