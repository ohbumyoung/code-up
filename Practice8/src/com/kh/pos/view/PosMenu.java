package com.kh.pos.view;
import com.kh.pos.controller.PosController;
import com.kh.pos.mode.Customer;
import com.kh.pos.mode.PaymentMethod;

import java.util.Scanner;

public class PosMenu {
	
	private PosController pc = new PosController();
	private Scanner sc = new Scanner(System.in);
	//private char[] customer;
	
	
	//public void startMenu() 도 가능
	public void mainMenu() {
		/*
		--- 자가 쇼핑 POS 등록 ---
		고객 이름 입력: 이도현
		고객 나이 입력: 15
		-------------------------
		==== 스마트 POS 단말기 메뉴 ====
		1. 마이페이지 (멤버십 정보)
		2. 전체 사용 가능 결제수단 조회
		3. 결제수단 검색
		4. 결제(구매)하기
		9. 시스템 종료
		메뉴 번호: 2
		*/
		System.out.println("---자가 쇼핑 POS 등록---");
		System.out.print("고객 이름 입력: ");
		String name = sc.next();
		System.out.print("고객 나이 입력: ");
		int age = sc.nextInt();
		
		pc.insertCustomer( new Customer(name, age) );
		sc.nextLine(); // 버퍼 지우기
		
		while(true) {
			System.out.println("=== 스마트 POS 단말기 메뉴 ===");
			System.out.println("1. 마이페이지 (멤버십 정보)");
			System.out.println("2. 전체 사용 가능 결제수단 조회");
			System.out.println("3. 결제수단 검색");
			System.out.println("4. 결제(구매)하기");
			System.out.println("9. 시스템 종료");
			System.out.print("메뉴 입력: ");
			
			int menu = sc.nextInt();
			
			sc.nextLine();
			
			switch(menu) {
			case 1:
				// 마이페이지 -> 고객 정보 -> 고객 정보 출력
				// 고객 정보는 Controller 의 getCustomerInfo() 통해 반환
				pc.getCustomerinfo();
				System.out.println(pc.getCustomerinfo());
				
				break;
				
			case 2:
				// 전체 사용 가능 결제수단 조회
				// 결제 수단 정보는 Controller 관리중임
				printAllMethoods();
				
				break;
				
			case 3:
				//결제수단 검색
				searchMethods();
				break;
				
			case 4:
				//결제하기
				checkout();
				break;
				
			case 9:
				// 시스템 종료
				return; //메소드 종료 -> 호출된 위치로 돌아간다
			default:
				System.out.println("존재하지 않는 메뉴입니다.");
				break;
				
		}
			
	}
	}
	
	public void printAllMethoods() {
		PaymentMethod[] methods = pc.selectALLMethoods();
		
		for(int i = 0; i < methods.length; i++) {
			System.out.println("[" + i + "번]" + methods[i]); 
		}
		
	}
	
	public void searchMethods() {
		System.out.print("검색할 결제 수단명 입력: ");
		String keyword = sc.nextLine();
		
		PaymentMethod[] result = pc.searchMethood(keyword);
		
		for(PaymentMethod method : result) {
			if(method != null) {
				System.out.println(method);
			}
			
		}
	}
	
	public void checkout() {
		/*
		==== 스마트 POS 단말기 메뉴 ====
				...
				메뉴 번호: 4
				이용할 결제 수단 번호 선택: 1>> [결과] 제한 연령 미달이거나, 모바일 페이 추가 보안 가이드(제한나이+3세) 기준 미달로 승인이 거절되었습니다.
		*/
		
		System.out.print("이용할 결제 수단 번호 선택: ");
		int index = sc.nextInt();
		
		/*
		pc.processPayment(index);
		
		if(pc.processPayment(index) == 0) {
			System.out.println("[결과] 결제 성공!");
		} else if (pc.processPayment(index) == 1) {
			System.out.println("[결과] 제한 연령 미달이거나, 모바일 페이 추가 보안 가이드(제한나이+3세) 기준 미달로 승인이 거절되었습니다.");
		
		} else if (pc.processPayment(index) == 2) {
			System.out.println("[결과] 케시백 제휴 카드로 확인되어 맴버십 포인트 500점이 특별 적립되었습니다.");
		} else {
			System.out.println("[시스템 오류] 관리자에게 문의하세요.");
		}*/
	// switch 문
	 	switch(pc.processPayment(index)){
	 	case 0:
	 		System.out.println("[결과] 결제 성공!");
	 		break;
	 	case 1: 
	 		System.out.println("[결과] 제한 연령 미달이거나, 모바일 페이 추가 보안 가이드(제한나이+3세) 기준 미달로 승인이 거절되었습니다.");
	 		break;
	 	case 2:
	 		System.out.println("[결과] 케시백 제휴 카드로 확인되어 맴버십 포인트 500점이 특별 적립되었습니다.");
	 		break;
	 	default:
	 		System.out.println("[시스템 오류] 관리자에게 문의하세요.");
	 		break;
	 	}
	 
	 
	
	}
	
}
