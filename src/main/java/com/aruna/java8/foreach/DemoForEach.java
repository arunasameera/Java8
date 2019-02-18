package com.aruna.java8.foreach;

import java.util.Arrays;
import java.util.List;

import com.aruna.java8.defaultmethod.Android;
import com.aruna.java8.defaultmethod.Phone;

public class DemoForEach {

	 public static void main( String[] args )
	    {
		 //This is java 8 foreach
	       List<Integer> values=Arrays.asList(4,5,6,7,8);
	       values.forEach(i -> System.out.println(i));
	    }
	
}
