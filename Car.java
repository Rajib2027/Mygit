package com.te.javabasics.abstraction;

public interface Car {
void accelerator();
void brakes();
void gear();
default void airBag() {
	
}
default void gps() {
	
}
}
