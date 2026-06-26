package com.kh.encapsulation;

public class Monster {
	
	// --필드--
	private int hp; // 체력
	
	//--생성자--
	public Monster() {
		// 체력을 100으로 초기화(변수에 값을 대입하는 행위)
		this.hp = 100;
	}
	
	//--메소드--
	// 공격 당함 => 체력을 깎는 메소드 (hp 변수의 값을 감소)
	public void attack(int damage) {
		if(damage > 100) {
			System.out.println("공격 할 수 있는 값은 100 이하여야 합니다.");
			return;
	// 전달 값: 공격을 당해서(전달 값) 체력을 깎는 메소드
		}
		
		//this.hp = this.hp - damage;
		this.hp -= damage;
	}
	
	// 체력확인 => 체력 값을 확인하는 메소드 (hp 변수의 값을 반환)
	public int getHp() {
		return this.hp;
	// 결과 값: 체력이라는 값을 확인해야 하기 때문에 결과 값을 작성
	}
	

}
