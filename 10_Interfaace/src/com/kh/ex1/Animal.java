package com.kh.ex1;

//[접근제한] interface interface명{} 

public interface Animal {
	// 추상 메소드: 몸체(구현부)가 없는 메소드, 미완성 메소드
	// 구성요소: 상수 필드와 추상 메소드로 구성
	
	// 움직인다
	public abstract void move();

	// 먹는다, abstract 생략 가능 
	public /*abstract*/void eat();
	
	// 소리를 낸다 public, abstract 생략가능
	/*public abstract*/void makeSound();
	
	
}
