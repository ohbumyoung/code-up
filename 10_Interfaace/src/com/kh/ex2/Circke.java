package com.kh.ex2;

public class Circke implements Shape {
	
	private double n;
	
	public Circke(double n) {
		this.n = n;
	}

	@Override
	public double calulateArea() {
		
		return (n*n*Math.PI);
	}
	

}
