package com.aruna.java8.defaultmethod;

public interface Phone{
	//This is interface for mobiles for dev envirnment
	void call();
	default void message(){
		System.out.println("Default method");
	}
	
}
