package com.kh.ex1.model.vo;

public class Audio implements RemoteControl {
	private int volumel;
	
	
	public Audio() {
		
	}

	@Override
	public void turnOn() {
		System.out.println("오디오를 킵니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > 10) {
			System.out.println("볼륨에 해당되지 않습니다");
		}else if (volume <0) {
			System.out.println("볼륨에 해당되지 않습니다");
		}else {
			System.out.println("Audio 볼륨을" + volume + "로 조절합니다");
			this.volumel = volumel;
		}
		
	}

}
