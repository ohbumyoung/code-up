package com.kh.ex2.controller;

import java.time.Duration;
import java.time.LocalDateTime;

import com.kh.ex2.model.Customer;

public class StudyCafeController {
	private Customer[] customers;
	private int customerCount;
	
	public StudyCafeController() {
		// 이 스터디 카페의 고객은 100명까지 관리 가능하다.
		customers = new Customer[100];
		// 고객 카운트는 0부터
		customerCount = 0;
	}

	public int getCustomerCount() {
		return customerCount;
	}

	public String registerCustomer(String id) {
		if (findCustomerById(id) != null) {
			return "[오류] 이미 등록된 회원입니다.";
		}
		// 고객 카운터를 늘리다가 100일때 그만
		if (customerCount >= customers.length) {
			return "[오류] 등록 정원을 초과했습니다. 가입할 수 없습니다.";
		}
		//고객 카운터를 ++를 한명씩 늘린다
		//중복 가입 여부를 체크하고 새 회원 카드를 발급합니다. 등록 시 오픈 기념 보너스 30분이 기본으로 지급됩니다.
		customers[customerCount++] = new Customer(id);
		return "[안내] 신규 회원 등록이 완료되었습니다. (오픈 기념 보너스 30분 지급!)";
		
		// TODO: 이미 등록된 경우 처리
	}
	
	public String checkIn(String id) {
		// 고객목록(배열)에서 해당 고백번호를 찾기
		Customer findCustomer = findCustomerById(id);
		
		if (findCustomer != null) {
			//등록된 고객이 있는 경우 잔여시간 확인(0분인 회원은 입실 차단)
			if(findCustomer.getRemainingTime() == 0) {
				return "[오류] 잔여 시간이 없습니다. 충전 후 이용해주세요.";
			}
			findCustomer.setCheckedIn(true);
			findCustomer.setCheckInTime(LocalDateTime.now());
			return "[안내] 입실 처리가 완료되었습니다.";
		} else {
			// 해당 고객이 없는 경우
			return "[오류] 등록되지 않은 회원입니다.";
			
		}
		
	}
	
	public String checkOut(String id) {
		Customer findCustomer = findCustomerById(id);
		
		if(findCustomer == null) {
			return "[오류] 등록된 고객 정보가 없습니다.";
		}
		if(findCustomer.isCheckedIn()) {
			return"[오류] 체크인 하지 않은 고객입니다.";
		}
		
		// 퇴실 처리: 남은 시간 계산, checkedIn, chekInTime 업데이트
		LocalDateTime now  = LocalDateTime.now();
		// Duration.between(체크인 시간, 체크아웃 기간(현재))
		int minutes = (int)Duration.between(findCustomer.getCheckInTime(), now).toMinutes();
		
		int remainingTime = findCustomer.getRemainingTime() - minutes;
		if (remainingTime < 0) {
			(remainingTime) = 0;
		}
		//Math.max(값1, 값2) 둘 중 큰값을 => Math.max(0, remainingTime);
		findCustomer.setRemainingTime(remainingTime);
		findCustomer.setCheckedIn(false);
		findCustomer.setCheckInTime(null);
		return String.format("[안내] 퇴실처리가 완료되었습니다.(퇴실 시간: %s)\n" + "[정산] 이용 시간: %d분\n"+"[정산] 남은 잔여 시간: %d분", now, minutes, remainingTime);
	}
	
	public String getCustomerInfo(String id) {
		Customer findCustomer = findCustomerById(id);
		if(findCustomer == null) {
			return "[오류] 등록되지 않은 회원입니다.";
		}
		
		String result = "[조회] 잔여 시간 : " + findCustomer.getRemainingTime() + "분\n";
		if(findCustomer.isCheckedIn()) {
			//입실 상태
			result += "[조회] 상태: 입실 중 (입실 시각: " + findCustomer.getCheckInTime() +")";
		}else {
			//퇴실 상태
			result += "[조회] 상태: 퇴실(미입실) 상태";
		}
		return result;
	}
	
	private Customer findCustomerById(String id) {
		// public String checkln(String id)이 하는 역할
		for(Customer c : customers) {
			if(c != null && c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}
	
}