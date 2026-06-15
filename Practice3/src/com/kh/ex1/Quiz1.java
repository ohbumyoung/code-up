package com.kh.ex1;

import java.util.Scanner;

public class Quiz1 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정사각형의 한 변의 길이:");
		
		int num = sc.nextInt();
		
		System.out.println("정사각형의 한 변의 길이:" + num);
		
		System.out.println("둘레의 길이: " + num*4);
		
		System.out.println("넓이: " +  + num*num);
		
		
		
	}

}


/*
 **입력 예시**

```java
정사각형 한 변의 길이 : 5
```

**출력 예시**

```bash
정사각형 한 변의 길이 : 5
둘레의 길이 : 20 5x4
넓이 : 25 5x5
```
 */