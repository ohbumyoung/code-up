package com.kh.ex2.controller;
import om.kh.ex2.model.Phone;
import om.kh.ex2.model.GalaxyNote9;
import om.kh.ex2.model.V40;
public class PhoneController {
	
	private String[] result = new String[2];
	
	public String[] method(){
	
	Phone[] phones = new Phone[2];
	phones[0] = new GalaxyNote9();
	phones[1] = new V40();
	
	int index = 0;
	for(Phone p : phones) {
		
		if(p instanceof GalaxyNote9) {
			result[index] = ((GalaxyNote9)p).printInformation();
		}else if (p instanceof V40) {
			result[index] = ((V40)p).printInformation();
	}
		index++;	
	}
	
	return result;
	}
	
	
}
