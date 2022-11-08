package com.te.javabasics.abstraction;

import java.util.Scanner;

public class CarFactory {
	public static Car getCar(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter car name");
		String carName= scanner.next();
		if (carName.equalsIgnoreCase("audi")) {
			return new Audi();
			
		}else if (carName.contentEquals("bmw")) {
			return new Bmw();
		}else {
			return null;
		}
		
	}

}
