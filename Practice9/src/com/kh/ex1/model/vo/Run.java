package com.kh.ex1.model.vo;

public class Run {

	public static void main(String[] args) {
	
		
		RemoteControl rc = new Television();
		RemoteControl rc2 = new Audio();
		
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		//--------------
		rc2.turnOn();
		rc2.setVolume(7);
		rc2.turnOff();
		
		
		

	}

}
