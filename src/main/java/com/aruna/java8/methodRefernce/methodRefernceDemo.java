package com.aruna.java8.methodRefernce;

import java.util.Arrays;
import java.util.List;

public class methodRefernceDemo {

	public static void main(String[] args) {
		//This is java 8 method Refernce
		List<String> names=Arrays.asList("Aruna","Sameera","Liyanage","Shanika","Malalgoda");
		//names.forEach(i -> System.out.println(i));
		
		names.forEach(System.out::println);
		
	}

}
