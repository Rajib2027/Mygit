package com.te.javabasics.abstraction;

public class Bmw implements Car {

	@Override
	public void accelerator() {
		// TODO Auto-generated method stub
		System.out.println("BMW has High acceleration");
		
	}

	@Override
	public void brakes() {
		// TODO Auto-generated method stub
		System.out.println("BMW has abs brakes");
		
		
	}

	@Override
	public void gear() {
		// TODO Auto-generated method stub
		System.out.println("BMW has automated gear");
		
	}
	@Override
	public void gps() {
		// TODO Auto-generated method stub
		System.out.println("BMW has gps");
	}
	

}


