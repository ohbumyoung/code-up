package com.kh.pos.controller;
import com.kh.pos.mode.Customer;
import com.kh.pos.mode.PaymentMethod;
import com.kh.pos.mode.MobilePay;
import com.kh.pos.mode.CardPayment;
public class PosController {
	
	private Customer customer;
	private PaymentMethod[] paymentList;
	
	//기본 생성자를 통해 초기화된 전체 결제 수단 배열(paymentList)
	public PosController() {
		//결제 수단 정보 초기화
		/*
[0번] 모바일페이 - 플랫폼: 네이버페이, 제한연령: 12세, 한도: 1000000원 | 제공사: NAVER
[1번] 모바일페이 - 플랫폼: 토스페이, 제한연령: 14세, 한도: 2000000원 | 제공사: Toss
[2번] 신용/체크카드 - 카드명: 국민 나라사랑카드, 제한연령: 12세, 한도: 500000원 | 캐시백 여부: 캐시백 가능
[3번] 신용/체크카드 - 카드명: 신한 체크카드, 제한연령: 8세, 한도: 300000원 | 캐시백 여부: 캐시백 없음

		 */
		paymentList = new PaymentMethod[4];
		
		paymentList[0] = new MobilePay("네이버페이", 12, 1000000, "NAVER");
		paymentList[1] = new MobilePay("토스페이", 14, 2000000, "TOSS");
		paymentList[2] = new CardPayment("국민 나라사랑카드", 12, 500000, true);
		paymentList[3] = new CardPayment("신한 체크카드", 8, 300000, false);
	}
	//고객 정보 추가
	//View단 에서 전달 받은 고객 객체 주소 값을 Controller의 customer 필드에 대입합니다.
	public void insertCustomer(Customer c) {
		customer = c;
	} // View 단에는 전달 받은 고객 객체 주소 값이 없는데...
	
	//고객 정보 조회
	//현재 등록된 고객 객체(customer)의 주소 값을 반환합니다. (마이페이지용)
	public Customer getCustomerinfo() {
		return customer;
	}
	
	// 모든 결제 수단 정보 조회
	//기본 생성자를 통해 초기화된 전체 결제 수단 배열(paymentList)의 주소값을 반환합니다.
	public PaymentMethod[] selectALLMethoods() {
		return paymentList;
	}
	
	// 전달 받은 키워드?  
	
	//전달 받은 키워드가 결제 수단 명칭(name)에 포함(contains)되어 있는지 확인하고,
	//검색된 객체들만 모은 새로운 배열을 동적으로 생성하여 반환합니다.
	
	// 검색하는 메소드(기능)를 만들겠다.
	public PaymentMethod[] searchMethood(String keyword) {
		// [1. 배열코드니깐 result(변수)값에 새로운 배열 를 만들고 길이는 paymentList(4)개 만큼]
		PaymentMethod[] result = new PaymentMethod[paymentList.length];
		
		//[2. 배열이니깐 인덱스를 사용해주고 인덱스를 0으로 초기화 한다.]
		int index = 0;
		// 결제 수단 정보 -> paymentList 필드에서 관리(PaymentMethod[])
		
		//[3. 저장된 인덱스를 불러오는데 향상된 for문을 사용해 0 ~ 3 순차적으로 뽑고]
		for(PaymentMethod method : paymentList) {
			//method => paymentList[인덱스] => PaymentMethod
			
			// [3-1. 뽑은 인덱스들의 저장된 이름도 불러온다]
			String methodName = method.getName();
					
			//문자열.contains : 문자열 내에 키워드가 포함되어 있으면 true, 그렇지 않으면 false
			// ex) "application".contains("cat") => true
			//     "application".contains("c a t") => false
			//     "application".contains("dog") => false
					
			// [4. if문을 사용해 검색한 키워드와 포함되어 있는지 확인 어떻게 확인하냐? => (문자열.contains)
			// 검색한 키워드와 포함되어 있는지 => 이말은 ex) "페이" 검색을 하면 paymentList 저장된 
			// 네이버 페이, 토스페이가 검색된다.]
					if(methodName.contains(keyword)) {
			
						// result값을 0으로 초기화 해놓았기 때문에 0번부터 검색 키워드가 맞으면 ex)카드로 검색하면
			// [5."국민 나라사랑카드", "신한 체크카드", null ,null
			// ex 네이버 검색하면 네이버페이, null, null, null ]
						result[index++] = method;
					}
		}
		
		return result;
	
		
	}
	
	/*
	전달 받은 인덱스의 결제 수단과 고객 정보를 비교 연산합니다.
	- 기본 연령 미달 또는 모바일 페이 보안 기준 미달: 1 리턴
	- 캐시백 카드 조건 충족 (고객 포인트 +500점 적립): 2 리턴
	- 일반 결제 정상 승인: 0 리턴
	*/
	public int processPayment(int index) {
		PaymentMethod method = paymentList[index];
		
		//1) 기본 연령 미달 또는 모바일 페이 보안 기준 미달 1 리턴
		// +해당 결재 수단이 모바일 페이인 경우 나이가 제한 연령+3세에 해당하는 자
		customer.getAge();
		method.getMinAge();
		//{ 입력된 고객나이와 연령미달 값을 비교하기 위해}
		
		//기본 연령 미달 또는 모바일 페이 보안 기준 미달: 1 리턴
		// 모바일 페이 결제 수단인지 확인
		// 모바일 페이 결제인 경우 제한연령 + 3 이하인지 확인
		if(method instanceof MobilePay && customer.getAge() <= method.getMinAge() + 3) {
		// {paymentList[index]가 모바일 페이고, 고객 나이가 연령제한+3보다 낮거나 같으면}
			return 1;
		} // 모바일 페이일 경우 1 반환 아니면
		
		// 기본 연령 미달인지 확인 => 고객 나이가 제한연령 이하인지 확인
		if(customer.getAge() <= method.getMinAge()) {
			return 1;
		}
		
		// 캐시백 카드 조건 충족 (고객 포인트 +500점 적립): 2 리턴
		// 결제 수단이 카드 결제인 경우, 캐시백 여부 확인
		if(method instanceof CardPayment && ((CardPayment) method).isHasCashback()) {
			// 
			
			//결과 리턴 전에 고객 포인트 점수 +500
			customer.getPoints();
			customer.setPoints(customer.getPoints()+ 500);
			
			return 2;
		}
		
		
		return 0;
	}
	

}
