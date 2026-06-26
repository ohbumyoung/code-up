package com.kh.ex1.model.vo;

public class Television implements RemoteControl {
	
	private int volume;
	
	
	public Television() {
		
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 킵니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		
		if(volume >= 0 && volume <=10) {
			System.out.println("TV 볼륨을" + volume + "로 조절합니다.");
			this.volume = volume;
		}else {
			System.out.println("해당되지 않는 볼륨입니다.");
		}
		
	}

}
