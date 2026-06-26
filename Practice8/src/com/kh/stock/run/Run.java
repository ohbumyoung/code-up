package com.kh.stock.run;
import com.kh.stock.model.Device;
import com.kh.stock.model.SmartPhone;
import com.kh.stock.model.Tablet;
public class Run {

	public static void main(String[] args) {
		//Device 크기 3인 배열 생성
		Device[]arr  = new Device[3];
		// 각 인덱스 안에 값 대입
		arr[0] = new SmartPhone("Apple", "iPhone 15", 1250000, "ios");
		arr[1] = new SmartPhone("Samsung", "Galaxy", 1150000, "Android");
		arr[2] = new Tablet("Samsung", "Galaxy", 980000, true);
				
		// 반복문 사용하여 출력 
		// => 공통된 getInformation()을 활용
		System.out.println("===매장 보유 디바이스 재고 목록 ===");
		
		for(Device d : arr) {
			d.getInformation();
			System.out.println(d.getInformation());
			
		}
		System.out.println("=============================");
		/*
		for(int i = 0; i<arr.length; i++) {
			
				System.out.println(arr[i].getInformation());	
			}
			*/
		}
	}


