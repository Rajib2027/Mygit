package com.te.javabasics.abstraction;

public class Audi  implements Car {

	@Override
	public void accelerator() {
		// TODO Auto-generated method stub
		System.out.println("audi has High acceleration");
		
		
	}

	@Override
	public void brakes() {
		// TODO Auto-generated method stub
		System.out.println("audi abs brakes");
		
		
	}

	@Override
	public void gear() {
		// TODO Auto-generated method stub
		System.out.println("audi automated gear");
		
		
	}
	@Override
	public void airBag() {
		// TODO Auto-generated method stub
		System.out.println("audi has airbags");
	}

}
