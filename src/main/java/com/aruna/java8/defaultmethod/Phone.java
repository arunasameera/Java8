package com.aruna.java8.defaultmethod;

public interface Phone{

	void call();
	default void message(){
		System.out.println("Default method");
	}
	
}
